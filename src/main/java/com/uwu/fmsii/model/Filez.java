package com.uwu.fmsii.model;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor	
@NoArgsConstructor
@Builder
@Table(name = "filez")
public class Filez {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@UniqueElements
	private String fileName;
	private String mime;
	private Boolean status;
	private Double size;
	private LocalDateTime createDateTime;
	private LocalDateTime updateDateTime;

}
