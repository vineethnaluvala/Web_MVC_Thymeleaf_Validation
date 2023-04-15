package in.vini.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private Integer pid;
	@NotBlank(message = "name should not be empty")
	@Size(min = 3, max = 15, message = "atleast 3 character should be there and maximum 15")
	private String name;

	@NotNull(message = "price should not be empty")
	@Positive
	private Double price;

	@NotNull(message = "quantity should not be empty")
	@Positive
	private Integer quantity;
}
