package com.example.taskbank.repository;

import com.example.taskbank.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {


    @Query(value = "select * from Invoice as i  where i.issued > i.due",nativeQuery = true)
   List<Invoice>getInvoiceIssueAfterInvoiceDue();



//    @Query("select i.id,i.issued,i.order.id ,o.date from Invoice as i inner join Order o on i.id = o.id where i.issued <o.date")



}
