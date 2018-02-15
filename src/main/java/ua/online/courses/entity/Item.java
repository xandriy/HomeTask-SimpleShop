package ua.online.courses.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Item extends BaseEntity{
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price", columnDefinition = "DECIMAL(8,2)")
	private BigDecimal price;
	
	@Column(name = "number")
	private int number;
	
	@Column(name = "description")
	private String description;
	
}
