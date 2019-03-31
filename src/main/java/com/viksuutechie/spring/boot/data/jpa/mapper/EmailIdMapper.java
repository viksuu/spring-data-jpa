
package com.viksuutechie.spring.boot.data.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.viksuutechie.spring.boot.data.jpa.dto.EmailIdDTO;
import com.viksuutechie.spring.boot.data.jpa.model.EmailId;

/**
 * @author vkumar
 *
 */

@Mapper(componentModel = "spring", uses = { EmployeeMapper.class })
public interface EmailIdMapper {

	EmailIdDTO EmailIdToEmailIdDTO(EmailId email_Id);

	EmailId email_IdDTOToEmailId(EmailIdDTO email_IdDTO);

	List<EmailId> listEmailIdDTOToEmailId(List<EmailIdDTO> email_IdsDto);

	List<EmailIdDTO> listEmailIdToEmailIdDTO(List<EmailId> email_Id);

}