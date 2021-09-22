package com.example.taskbank.service;

import com.example.taskbank.mapper.InvoicesMapper;
import com.example.taskbank.model.Invoice;
import com.example.taskbank.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private final InvoicesMapper invoicesMapper;

//    expired_invoices
    public List<Invoice> expired_invoices() {
        return invoiceRepository.getInvoiceIssueAfterInvoiceDue();
    }


    //    wrong_data_invoices
    String query = "select i.id,i.issued,i.order_id ,o.date from Invoice as i inner join orders o on i.id = o.invoice_id where i.issued <o.date\n";
    public List<Invoice> wrong_data_invoices() {
        return namedParameterJdbcTemplate.query(query, invoicesMapper);
    }


}
