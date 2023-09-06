package com.example.springboot;

import com.example.springboot.base.ResultData;
import com.example.springboot.domain.Demo;
import com.example.springboot.service.DemoServiceImpl;
import jakarta.annotation.Resource;
import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoServiceImpl demoService;

    @GetMapping("/{id}")
    public ResultData<Demo> getDemoById(@PathVariable @NotBlank String id) {
        return ResultData.<Demo>success()
                .data(demoService.getDemoById(id))
                .build();
    }

    @PostMapping
    public ResultData<Void> insertDemo(@RequestBody @Validated Demo demo) {
        demoService.insertDemo(demo);
        return ResultData.<Void>success().build();
    }

    @PutMapping("")
    public ResultData<Void> updateDemo(@RequestBody @Validated Demo demo) {
        demoService.updateDemo(demo);
        return ResultData.<Void>success().build();
    }

    @DeleteMapping("/{id}")
    public ResultData<Void> deleteDemo(@PathVariable @NotBlank String id) {
        demoService.deleteDemo(id);
        return ResultData.<Void>success().build();
    }

}
