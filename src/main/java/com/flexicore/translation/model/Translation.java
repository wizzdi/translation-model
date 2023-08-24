package com.flexicore.translation.model;

import com.flexicore.model.Baseclass;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Translation extends Baseclass {



	private String externalId;
	private String languageCode;
	@ManyToOne(targetEntity = Baseclass.class)
	private Baseclass translated;

	public Translation() {
	}
	public String getExternalId() {
		return externalId;
	}

	public <T extends Translation> T setExternalId(String externalId) {
		this.externalId = externalId;
		return (T) this;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public <T extends Translation> T setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
		return (T) this;
	}

	@ManyToOne(targetEntity = Baseclass.class)
	public Baseclass getTranslated() {
		return translated;
	}

	public <T extends Translation> T setTranslated(Baseclass translated) {
		this.translated = translated;
		return (T) this;
	}
}
