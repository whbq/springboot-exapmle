package com.whb.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.qianshan.mapper.YiwugouPrudetailMapper;
import com.whb.entity.YiwugouPrudetail;
import com.whb.repository.YiwugouPrudetailRepository;
import com.whb.service.EsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Service
public class EsServiceImpl implements EsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EsServiceImpl.class);

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Resource
    private YiwugouPrudetailMapper yiwugouPrudetailMapper;
    @Resource
    private YiwugouPrudetailRepository yiwugouPrudetailRepository;

    @Override
    public void add(YiwugouPrudetail yiwugouPrudetail) {
        PageHelper.startPage(2, 10, true);
        List<com.qianshan.modal.YiwugouPrudetail> yiwugouPrudetails = yiwugouPrudetailMapper.selectAll();
        String json = JSON.toJSONString(yiwugouPrudetails);
        List<YiwugouPrudetail> yiwugouPrudetails1 = JSON.parseArray(json, YiwugouPrudetail.class);
        yiwugouPrudetails1.forEach(yiwugouPrudetail1 -> {
            yiwugouPrudetailRepository.save(yiwugouPrudetail);
        });

    }

    @Override
    public void selectAll() {

        Iterator<YiwugouPrudetail> yiwugouPrudetails = yiwugouPrudetailRepository.findAll().iterator();
        while (yiwugouPrudetails.hasNext()){
            System.out.println(JSON.toJSONString(yiwugouPrudetails.next()));
        }

    }
}
