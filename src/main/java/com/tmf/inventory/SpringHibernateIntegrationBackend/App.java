package com.tmf.inventory.SpringHibernateIntegrationBackend;

import java.sql.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tmf.inventory.SpringHibernateIntegrationBackend.config.SessionFactoryConfig;
import com.tmf.inventory.SpringHibernateIntegrationBackend.models.Batch;
import com.tmf.inventory.SpringHibernateIntegrationBackend.services.BatchService;
import com.tmf.inventory.SpringHibernateIntegrationBackend.services.BatchServiceImplementation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SessionFactoryConfig.class);
        BatchService service = ctx.getBean(BatchServiceImplementation.class);
        
		/*
		 * Date sDate1 = Date.valueOf("2023-01-15"); Date eDate1 =
		 * Date.valueOf("2023-05-15"); Batch batch1 = new Batch(101,sDate1,eDate1); Date
		 * sDate2 = Date.valueOf("2023-01-17"); Date eDate2 =
		 * Date.valueOf("2023-05-17"); Batch batch2 = new Batch(103,sDate2,eDate2);
		 * 
		 * service.addNewBatch(batch1); service.addNewBatch(batch2);
		 */
        
		
		for(Batch batch : service.displayAllBatches())
		{ 
			System.out.println(batch); 
		}
		 
        Date eDate1 = Date.valueOf("2023-05-18"); 
        Batch batch1 = service.displayBatchById(1);
        batch1.setEndDate(eDate1);
        service.updateBatch(batch1);
        
        
        for(Batch batch : service.displayAllBatches())
		{ 
			System.out.println(batch); 
		}
        
    }
}
