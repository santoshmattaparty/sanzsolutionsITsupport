package com.sanzsolutions.web;

import com.sanzsolutions.contact.ContactMessage;
import com.sanzsolutions.contact.ContactMessageRepository;
import com.sanzsolutions.content.InfoItemRepository;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    private final InfoItemRepository infoItemRepository;
    private final ContactMessageRepository contactMessageRepository;
    public HomeController(InfoItemRepository infoItemRepository, ContactMessageRepository contactMessageRepository) { this.infoItemRepository = infoItemRepository; this.contactMessageRepository = contactMessageRepository; }
    @GetMapping("/") public String home(Model model) { model.addAttribute("items", infoItemRepository.findAllByOrderByDisplayOrderAsc()); model.addAttribute("contactMessage", new ContactMessage()); return "home"; }
    @PostMapping("/contact") public String contact(@Valid @ModelAttribute ContactMessage contactMessage, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) { model.addAttribute("items", infoItemRepository.findAllByOrderByDisplayOrderAsc()); return "home"; }
        contactMessageRepository.save(contactMessage); redirectAttributes.addFlashAttribute("successMessage", "Thank you. Sanzsolutions received your enquiry."); return "redirect:/#contact";
    }
}
