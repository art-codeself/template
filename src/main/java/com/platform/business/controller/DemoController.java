package com.platform.business.controller;



import com.platform.business.model.dto.DemoDto;
import com.platform.business.model.entity.SysDemo;
import com.platform.business.service.SysDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * [简要描述]:演示信息前端控制器
 * [详细描述]:演示信息后端管理API,包括CRUD操作
 *
 * @author zero
 * @version 1.0, 2019/10/02
 * @since JDK 1.8
 *
 */
@Api(value="[Demo]演示信息操作接口")
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController {
    @Autowired
    private SysDemoService sysDemoService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * 通过ID查询演示信息
     *
     * @param id ID
     * @return 演示信息
     */
    @ApiOperation(value="获取单条演示信息", notes="根据演示信息Id获取演示信息")
    @GetMapping("/{id}")
    public DemoDto demo(@PathVariable Integer id) {
        return this.convertToDto(sysDemoService.getById(id));
    }


    DemoDto convertToDto(SysDemo entity) {
        return modelMapper.map(entity, DemoDto.class);
    }

    SysDemo convertToModel(DemoDto entityDto) {
        return modelMapper.map(entityDto, SysDemo.class);
    }

    List<DemoDto> convertToDtos(List<SysDemo> entitys) {
        return modelMapper.map(entitys, new TypeToken<List<DemoDto>>() {}.getType());
    }

    List<SysDemo> convertToModels(List<DemoDto> entityDtos) {
        return modelMapper.map(entityDtos, new TypeToken<List<SysDemo>>() {}.getType());
    }

}
