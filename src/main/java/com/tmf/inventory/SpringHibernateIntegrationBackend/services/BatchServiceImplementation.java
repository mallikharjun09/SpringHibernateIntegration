package com.tmf.inventory.SpringHibernateIntegrationBackend.services;

import java.sql.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.inventory.SpringHibernateIntegrationBackend.dao.BatchDAO;
import com.tmf.inventory.SpringHibernateIntegrationBackend.models.Batch;


@Service
public class BatchServiceImplementation implements BatchService{

	@Autowired
	BatchDAO dao;
	
	
	@Override
	public void addNewBatch(Batch batch) {
		// TODO Auto-generated method stub
		dao.addNewBatch(batch);
	}

	@Override
	public void updateBatch(Batch batch) {
		// TODO Auto-generated method stub
		dao.updateBatch(batch);
	}

	@Override
	public void deleteBatch(Batch batch) {
		// TODO Auto-generated method stub
		dao.deleteBatch(batch);
	}

	@Override
	public List<Batch> displayAllBatches() {
		// TODO Auto-generated method stub
		return dao.displayAllBatches();
	}

	@Override
	public List<Batch> displayBatchByCourse(int courseId) {
		// TODO Auto-generated method stub
		return dao.displayBatchByCourse(courseId);
	}

	@Override
	public List<Batch> displayBatchByStartDate(Date batchStartDate) {
		// TODO Auto-generated method stub
		return dao.displayBatchByStartDate(batchStartDate);
	}

	@Override
	public List<Batch> displayBatchByEndDate(Date batchEndDate) {
		// TODO Auto-generated method stub
		return dao.displayBatchByEndDate(batchEndDate);
	}

	@Override
	public Batch displayBatchById(int batchId) {
		// TODO Auto-generated method stub
		return dao.displayBatchById(batchId);
	}

}
