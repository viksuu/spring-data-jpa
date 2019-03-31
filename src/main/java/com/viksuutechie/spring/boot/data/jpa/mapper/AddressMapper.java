
package com.viksuutechie.spring.boot.data.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.viksuutechie.spring.boot.data.jpa.dto.AddressDTO;
import com.viksuutechie.spring.boot.data.jpa.model.Address;

/**
 * @author vkumar
 *
 */

@Mapper(componentModel = "spring", uses = { EmployeeMapper.class })
public interface AddressMapper {

	AddressDTO addressToAddressDTO(Address address);

	Address addressDTOToAddress(AddressDTO addressDTO);

	List<Address> listAddressDTOToAddress(List<AddressDTO> addresssDto);

	List<AddressDTO> listAddressToAddressDTO(List<AddressDTO> address);

}