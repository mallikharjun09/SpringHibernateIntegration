package com.tmf.inventory.SpringHibernateIntegrationBackend.services;

import java.sql.Date;
import java.util.List;

import com.tmf.inventory.SpringHibernateIntegrationBackend.models.Batch;

public interface BatchService {
	void addNewBatch(Batch batch);
	void updateBatch(Batch batch);
	void deleteBatch(Batch batch);
	List<Batch> displayAllBatches();
	List<Batch> displayBatchByCourse(int courseId);
	List<Batch> displayBatchByStartDate(Date batchStartDate);
	List<Batch> displayBatchByEndDate(Date batchEndDate);
	Batch displayBatchById(int batchId);
}
