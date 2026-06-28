package com.sanzsolutions.config;

import com.sanzsolutions.content.InfoItem;
import com.sanzsolutions.content.InfoItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final InfoItemRepository infoItemRepository;
    public DataInitializer(InfoItemRepository infoItemRepository) { this.infoItemRepository = infoItemRepository; }
    @Override public void run(String... args) {
        if (infoItemRepository.count() > 0) return;
        infoItemRepository.save(new InfoItem("IT Support", "Desktop and Laptop Support", "Troubleshooting, software setup, printer support, email configuration, and day-to-day technical assistance for small offices and home users.", 1));
        infoItemRepository.save(new InfoItem("IT Support", "Office Network Support", "Basic network planning, router setup, Wi-Fi improvement, cable checks, and connectivity problem solving.", 2));
        infoItemRepository.save(new InfoItem("Network Switches", "Unmanaged Switches", "Simple plug-and-play switches for expanding wired network ports in homes, shops, and small offices.", 3));
        infoItemRepository.save(new InfoItem("Network Switches", "Managed Switches", "Switches with VLANs, traffic control, monitoring, and improved administration for growing business networks.", 4));
        infoItemRepository.save(new InfoItem("Network Switches", "PoE Switches", "Power over Ethernet switches for IP cameras, wireless access points, and VoIP phones using one network cable.", 5));
    }
}
