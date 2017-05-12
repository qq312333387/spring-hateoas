package org.springframework.hateoas.siren;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All entities that have classes and a title.
 *
 * @author Dietrich Schulten
 */
public abstract class AbstractSirenEntity extends AbstractSirenNode {

	private List<String> sirenClasses;

	AbstractSirenEntity() {

	}

	public AbstractSirenEntity(String title, List<String> sirenClasses) {
		super(title);
		this.sirenClasses = sirenClasses;
	}

	@JsonProperty("class")
	public List<String> getSirenClasses() {
		return sirenClasses;
	}

	public void setSirenClasses(List<String> sirenClasses) {
		this.sirenClasses = sirenClasses;
	}
}