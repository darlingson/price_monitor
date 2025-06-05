package com.darlingson.price_monitor_api.scheduler;

import org.quartz.Job;  
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.darlingson.price_monitor_api.pricelog.PriceLogService;

@Component
public class PriceUpdaterJob implements Job {
    private static final Logger logger = LoggerFactory.getLogger(PriceUpdaterJob.class);
    
    @Autowired
    private PriceLogService priceLogService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("Starting price update job");
        try {
            priceLogService.updateAllPrices();
        } catch (Exception e) {
            logger.error("Error executing price update job", e);
            throw new JobExecutionException(e);
        }
    }
}
