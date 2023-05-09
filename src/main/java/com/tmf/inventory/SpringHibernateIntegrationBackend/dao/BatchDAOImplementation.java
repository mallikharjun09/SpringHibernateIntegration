package com.tmf.inventory.SpringHibernateIntegrationBackend.dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tmf.inventory.SpringHibernateIntegrationBackend.models.Batch;




@Repository
@Transactional
public class BatchDAOImplementation implements BatchDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addNewBatch(Batch batch) {
		getSession().save(batch);
		System.out.println("A Batch has been inserted");
	}

	@Override
	public void updateBatch(Batch batch) {
		// TODO Auto-generated method stub
		getSession().update(batch);
		System.out.println("Batch updated Successfully...");
	}

	@Override
	public void deleteBatch(Batch batch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Batch> displayAllBatches() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Batch").list();
	}

	@Override
	public List<Batch> displayBatchByCourse(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Batch> displayBatchByStartDate(Date batchStartDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Batch> displayBatchByEndDate(Date batchEndDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Batch displayBatchById(int batchId) {
		// TODO Auto-generated method stub
		return getSession().find(Batch.class, batchId);
	}

}
