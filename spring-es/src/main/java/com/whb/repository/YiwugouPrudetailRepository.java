package com.whb.repository;


import com.whb.entity.YiwugouPrudetail;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public  interface YiwugouPrudetailRepository extends ElasticsearchRepository<YiwugouPrudetail,String> {
}
