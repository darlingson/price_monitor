package com.darlingson.price_monitor_api.pricelog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceLogRepository extends JpaRepository<PriceLog, Long> {
    
}
