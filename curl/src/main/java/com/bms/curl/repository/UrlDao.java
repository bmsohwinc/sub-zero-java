package com.bms.curl.repository;

import org.springframework.data.repository.CrudRepository;

import com.bms.curl.domain.DimUrl;

public interface UrlDao extends CrudRepository<DimUrl, String> {
    
}
