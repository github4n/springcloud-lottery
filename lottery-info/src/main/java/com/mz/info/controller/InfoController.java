package com.mz.info.controller;

import com.mz.info.enitity.BallHistory;
import com.mz.info.repository.HistoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Autowired
    HistoryRepository historyRepository;

    @GetMapping("/history")
    public Page<BallHistory> history() {
        Sort sort = new Sort("code");

        //查询前50条
        PageRequest request = new PageRequest(0, 50, sort);
        return historyRepository.findAll(request);
    }

}
