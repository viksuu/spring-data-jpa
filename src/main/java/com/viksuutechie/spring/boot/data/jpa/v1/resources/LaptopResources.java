package com.viksuutechie.spring.boot.data.jpa.v1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viksuutechie.spring.boot.data.jpa.dto.LaptopDTO;
import com.viksuutechie.spring.boot.data.jpa.service.LaptopService;

/**
 * @author vkumar
 *
 */


@RestController
@RequestMapping(value ="/v1/laptop")
public class LaptopResources {

	@Autowired 
	private LaptopService laptopService;
	
	@PostMapping
	public List<LaptopDTO> createLaptop(@RequestBody List<LaptopDTO> laptops){
		
		return laptopService.createLaptop(laptops);
	}
	
}


/**
[
    {
        "id": 1,
        "brand": "DELL",
        "lapCode": "NS-234",
        "isAssigned": true
    },
    {
        "id": 2,
        "brand": "HP",
        "lapCode": "NS-214",
        "isAssigned": false
    }
]
 */
