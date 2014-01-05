package org.synaptec.apps.ishop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

@Entity
@Table(name = "SUPPORTED_LANGUAGE")  
@Indexed
public class SupportedLanguage extends BaseEntityAudit {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6345291547298694407L;
	
	@NotNull
	@Column(unique=true)
	@IndexedEmbedded
	private String name;
	
	@NotNull
	private String image;

	public SupportedLanguage(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	

}
