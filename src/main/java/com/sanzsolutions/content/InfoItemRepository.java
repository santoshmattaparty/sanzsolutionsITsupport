package com.sanzsolutions.content;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoItemRepository extends JpaRepository<InfoItem, Long> {
    List<InfoItem> findAllByOrderByDisplayOrderAsc();
}
