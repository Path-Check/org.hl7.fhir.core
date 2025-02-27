package org.hl7.fhir.r5.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Tue, Dec 13, 2022 17:53+1100 for FHIR vcurrent

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
 */
@ResourceDef(name="EnrollmentResponse", profile="http://hl7.org/fhir/StructureDefinition/EnrollmentResponse")
public class EnrollmentResponse extends DomainResource {

    public enum EnrollmentOutcome {
        /**
         * The Claim/Pre-authorization/Pre-determination has been received but processing has not begun.
         */
        QUEUED, 
        /**
         * The processing has completed without errors
         */
        COMPLETE, 
        /**
         * One or more errors have been detected in the Claim
         */
        ERROR, 
        /**
         * No errors have been detected in the Claim and some of the adjudication has been performed.
         */
        PARTIAL, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static EnrollmentOutcome fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("queued".equals(codeString))
          return QUEUED;
        if ("complete".equals(codeString))
          return COMPLETE;
        if ("error".equals(codeString))
          return ERROR;
        if ("partial".equals(codeString))
          return PARTIAL;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown EnrollmentOutcome code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case QUEUED: return "queued";
            case COMPLETE: return "complete";
            case ERROR: return "error";
            case PARTIAL: return "partial";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case QUEUED: return "http://hl7.org/fhir/enrollment-outcome";
            case COMPLETE: return "http://hl7.org/fhir/enrollment-outcome";
            case ERROR: return "http://hl7.org/fhir/enrollment-outcome";
            case PARTIAL: return "http://hl7.org/fhir/enrollment-outcome";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case QUEUED: return "The Claim/Pre-authorization/Pre-determination has been received but processing has not begun.";
            case COMPLETE: return "The processing has completed without errors";
            case ERROR: return "One or more errors have been detected in the Claim";
            case PARTIAL: return "No errors have been detected in the Claim and some of the adjudication has been performed.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case QUEUED: return "Queued";
            case COMPLETE: return "Processing Complete";
            case ERROR: return "Error";
            case PARTIAL: return "Partial Processing";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class EnrollmentOutcomeEnumFactory implements EnumFactory<EnrollmentOutcome> {
    public EnrollmentOutcome fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("queued".equals(codeString))
          return EnrollmentOutcome.QUEUED;
        if ("complete".equals(codeString))
          return EnrollmentOutcome.COMPLETE;
        if ("error".equals(codeString))
          return EnrollmentOutcome.ERROR;
        if ("partial".equals(codeString))
          return EnrollmentOutcome.PARTIAL;
        throw new IllegalArgumentException("Unknown EnrollmentOutcome code '"+codeString+"'");
        }
        public Enumeration<EnrollmentOutcome> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<EnrollmentOutcome>(this, EnrollmentOutcome.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<EnrollmentOutcome>(this, EnrollmentOutcome.NULL, code);
        if ("queued".equals(codeString))
          return new Enumeration<EnrollmentOutcome>(this, EnrollmentOutcome.QUEUED, code);
        if ("complete".equals(codeString))
          return new Enumeration<EnrollmentOutcome>(this, EnrollmentOutcome.COMPLETE, code);
        if ("error".equals(codeString))
          return new Enumeration<EnrollmentOutcome>(this, EnrollmentOutcome.ERROR, code);
        if ("partial".equals(codeString))
          return new Enumeration<EnrollmentOutcome>(this, EnrollmentOutcome.PARTIAL, code);
        throw new FHIRException("Unknown EnrollmentOutcome code '"+codeString+"'");
        }
    public String toCode(EnrollmentOutcome code) {
      if (code == EnrollmentOutcome.QUEUED)
        return "queued";
      if (code == EnrollmentOutcome.COMPLETE)
        return "complete";
      if (code == EnrollmentOutcome.ERROR)
        return "error";
      if (code == EnrollmentOutcome.PARTIAL)
        return "partial";
      return "?";
      }
    public String toSystem(EnrollmentOutcome code) {
      return code.getSystem();
      }
    }

    /**
     * The Response business identifier.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Business Identifier", formalDefinition="The Response business identifier." )
    protected List<Identifier> identifier;

    /**
     * The status of the resource instance.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=0, max=1, modifier=true, summary=true)
    @Description(shortDefinition="active | cancelled | draft | entered-in-error", formalDefinition="The status of the resource instance." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/fm-status")
    protected Enumeration<FinancialResourceStatusCodes> status;

    /**
     * Original request resource reference.
     */
    @Child(name = "request", type = {EnrollmentRequest.class}, order=2, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Claim reference", formalDefinition="Original request resource reference." )
    protected Reference request;

    /**
     * Processing status: error, complete.
     */
    @Child(name = "outcome", type = {CodeType.class}, order=3, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="queued | complete | error | partial", formalDefinition="Processing status: error, complete." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/enrollment-outcome")
    protected Enumeration<EnrollmentOutcome> outcome;

    /**
     * A description of the status of the adjudication.
     */
    @Child(name = "disposition", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Disposition Message", formalDefinition="A description of the status of the adjudication." )
    protected StringType disposition;

    /**
     * The date when the enclosed suite of services were performed or completed.
     */
    @Child(name = "created", type = {DateTimeType.class}, order=5, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Creation date", formalDefinition="The date when the enclosed suite of services were performed or completed." )
    protected DateTimeType created;

    /**
     * The Insurer who produced this adjudicated response.
     */
    @Child(name = "organization", type = {Organization.class}, order=6, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Insurer", formalDefinition="The Insurer who produced this adjudicated response." )
    protected Reference organization;

    /**
     * The practitioner who is responsible for the services rendered to the patient.
     */
    @Child(name = "requestProvider", type = {Practitioner.class, PractitionerRole.class, Organization.class}, order=7, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Responsible practitioner", formalDefinition="The practitioner who is responsible for the services rendered to the patient." )
    protected Reference requestProvider;

    private static final long serialVersionUID = -1503790623L;

  /**
   * Constructor
   */
    public EnrollmentResponse() {
      super();
    }

    /**
     * @return {@link #identifier} (The Response business identifier.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EnrollmentResponse setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public EnrollmentResponse addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<FinancialResourceStatusCodes> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<FinancialResourceStatusCodes>(new FinancialResourceStatusCodesEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public EnrollmentResponse setStatusElement(Enumeration<FinancialResourceStatusCodes> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of the resource instance.
     */
    public FinancialResourceStatusCodes getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the resource instance.
     */
    public EnrollmentResponse setStatus(FinancialResourceStatusCodes value) { 
      if (value == null)
        this.status = null;
      else {
        if (this.status == null)
          this.status = new Enumeration<FinancialResourceStatusCodes>(new FinancialResourceStatusCodesEnumFactory());
        this.status.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #request} (Original request resource reference.)
     */
    public Reference getRequest() { 
      if (this.request == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.request");
        else if (Configuration.doAutoCreate())
          this.request = new Reference(); // cc
      return this.request;
    }

    public boolean hasRequest() { 
      return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Original request resource reference.)
     */
    public EnrollmentResponse setRequest(Reference value) { 
      this.request = value;
      return this;
    }

    /**
     * @return {@link #outcome} (Processing status: error, complete.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public Enumeration<EnrollmentOutcome> getOutcomeElement() { 
      if (this.outcome == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.outcome");
        else if (Configuration.doAutoCreate())
          this.outcome = new Enumeration<EnrollmentOutcome>(new EnrollmentOutcomeEnumFactory()); // bb
      return this.outcome;
    }

    public boolean hasOutcomeElement() { 
      return this.outcome != null && !this.outcome.isEmpty();
    }

    public boolean hasOutcome() { 
      return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (Processing status: error, complete.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public EnrollmentResponse setOutcomeElement(Enumeration<EnrollmentOutcome> value) { 
      this.outcome = value;
      return this;
    }

    /**
     * @return Processing status: error, complete.
     */
    public EnrollmentOutcome getOutcome() { 
      return this.outcome == null ? null : this.outcome.getValue();
    }

    /**
     * @param value Processing status: error, complete.
     */
    public EnrollmentResponse setOutcome(EnrollmentOutcome value) { 
      if (value == null)
        this.outcome = null;
      else {
        if (this.outcome == null)
          this.outcome = new Enumeration<EnrollmentOutcome>(new EnrollmentOutcomeEnumFactory());
        this.outcome.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #disposition} (A description of the status of the adjudication.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public StringType getDispositionElement() { 
      if (this.disposition == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.disposition");
        else if (Configuration.doAutoCreate())
          this.disposition = new StringType(); // bb
      return this.disposition;
    }

    public boolean hasDispositionElement() { 
      return this.disposition != null && !this.disposition.isEmpty();
    }

    public boolean hasDisposition() { 
      return this.disposition != null && !this.disposition.isEmpty();
    }

    /**
     * @param value {@link #disposition} (A description of the status of the adjudication.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public EnrollmentResponse setDispositionElement(StringType value) { 
      this.disposition = value;
      return this;
    }

    /**
     * @return A description of the status of the adjudication.
     */
    public String getDisposition() { 
      return this.disposition == null ? null : this.disposition.getValue();
    }

    /**
     * @param value A description of the status of the adjudication.
     */
    public EnrollmentResponse setDisposition(String value) { 
      if (Utilities.noString(value))
        this.disposition = null;
      else {
        if (this.disposition == null)
          this.disposition = new StringType();
        this.disposition.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() { 
      if (this.created == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.created");
        else if (Configuration.doAutoCreate())
          this.created = new DateTimeType(); // bb
      return this.created;
    }

    public boolean hasCreatedElement() { 
      return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() { 
      return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public EnrollmentResponse setCreatedElement(DateTimeType value) { 
      this.created = value;
      return this;
    }

    /**
     * @return The date when the enclosed suite of services were performed or completed.
     */
    public Date getCreated() { 
      return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when the enclosed suite of services were performed or completed.
     */
    public EnrollmentResponse setCreated(Date value) { 
      if (value == null)
        this.created = null;
      else {
        if (this.created == null)
          this.created = new DateTimeType();
        this.created.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public Reference getOrganization() { 
      if (this.organization == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.organization");
        else if (Configuration.doAutoCreate())
          this.organization = new Reference(); // cc
      return this.organization;
    }

    public boolean hasOrganization() { 
      return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public EnrollmentResponse setOrganization(Reference value) { 
      this.organization = value;
      return this;
    }

    /**
     * @return {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Reference getRequestProvider() { 
      if (this.requestProvider == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.requestProvider");
        else if (Configuration.doAutoCreate())
          this.requestProvider = new Reference(); // cc
      return this.requestProvider;
    }

    public boolean hasRequestProvider() { 
      return this.requestProvider != null && !this.requestProvider.isEmpty();
    }

    /**
     * @param value {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public EnrollmentResponse setRequestProvider(Reference value) { 
      this.requestProvider = value;
      return this;
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "The Response business identifier.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("status", "code", "The status of the resource instance.", 0, 1, status));
        children.add(new Property("request", "Reference(EnrollmentRequest)", "Original request resource reference.", 0, 1, request));
        children.add(new Property("outcome", "code", "Processing status: error, complete.", 0, 1, outcome));
        children.add(new Property("disposition", "string", "A description of the status of the adjudication.", 0, 1, disposition));
        children.add(new Property("created", "dateTime", "The date when the enclosed suite of services were performed or completed.", 0, 1, created));
        children.add(new Property("organization", "Reference(Organization)", "The Insurer who produced this adjudicated response.", 0, 1, organization));
        children.add(new Property("requestProvider", "Reference(Practitioner|PractitionerRole|Organization)", "The practitioner who is responsible for the services rendered to the patient.", 0, 1, requestProvider));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "The Response business identifier.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -892481550: /*status*/  return new Property("status", "code", "The status of the resource instance.", 0, 1, status);
        case 1095692943: /*request*/  return new Property("request", "Reference(EnrollmentRequest)", "Original request resource reference.", 0, 1, request);
        case -1106507950: /*outcome*/  return new Property("outcome", "code", "Processing status: error, complete.", 0, 1, outcome);
        case 583380919: /*disposition*/  return new Property("disposition", "string", "A description of the status of the adjudication.", 0, 1, disposition);
        case 1028554472: /*created*/  return new Property("created", "dateTime", "The date when the enclosed suite of services were performed or completed.", 0, 1, created);
        case 1178922291: /*organization*/  return new Property("organization", "Reference(Organization)", "The Insurer who produced this adjudicated response.", 0, 1, organization);
        case 1601527200: /*requestProvider*/  return new Property("requestProvider", "Reference(Practitioner|PractitionerRole|Organization)", "The practitioner who is responsible for the services rendered to the patient.", 0, 1, requestProvider);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<FinancialResourceStatusCodes>
        case 1095692943: /*request*/ return this.request == null ? new Base[0] : new Base[] {this.request}; // Reference
        case -1106507950: /*outcome*/ return this.outcome == null ? new Base[0] : new Base[] {this.outcome}; // Enumeration<EnrollmentOutcome>
        case 583380919: /*disposition*/ return this.disposition == null ? new Base[0] : new Base[] {this.disposition}; // StringType
        case 1028554472: /*created*/ return this.created == null ? new Base[0] : new Base[] {this.created}; // DateTimeType
        case 1178922291: /*organization*/ return this.organization == null ? new Base[0] : new Base[] {this.organization}; // Reference
        case 1601527200: /*requestProvider*/ return this.requestProvider == null ? new Base[0] : new Base[] {this.requestProvider}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -892481550: // status
          value = new FinancialResourceStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<FinancialResourceStatusCodes>
          return value;
        case 1095692943: // request
          this.request = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1106507950: // outcome
          value = new EnrollmentOutcomeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.outcome = (Enumeration) value; // Enumeration<EnrollmentOutcome>
          return value;
        case 583380919: // disposition
          this.disposition = TypeConvertor.castToString(value); // StringType
          return value;
        case 1028554472: // created
          this.created = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case 1178922291: // organization
          this.organization = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1601527200: // requestProvider
          this.requestProvider = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("status")) {
          value = new FinancialResourceStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<FinancialResourceStatusCodes>
        } else if (name.equals("request")) {
          this.request = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("outcome")) {
          value = new EnrollmentOutcomeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.outcome = (Enumeration) value; // Enumeration<EnrollmentOutcome>
        } else if (name.equals("disposition")) {
          this.disposition = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("created")) {
          this.created = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("organization")) {
          this.organization = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("requestProvider")) {
          this.requestProvider = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -892481550:  return getStatusElement();
        case 1095692943:  return getRequest();
        case -1106507950:  return getOutcomeElement();
        case 583380919:  return getDispositionElement();
        case 1028554472:  return getCreatedElement();
        case 1178922291:  return getOrganization();
        case 1601527200:  return getRequestProvider();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 1095692943: /*request*/ return new String[] {"Reference"};
        case -1106507950: /*outcome*/ return new String[] {"code"};
        case 583380919: /*disposition*/ return new String[] {"string"};
        case 1028554472: /*created*/ return new String[] {"dateTime"};
        case 1178922291: /*organization*/ return new String[] {"Reference"};
        case 1601527200: /*requestProvider*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type EnrollmentResponse.status");
        }
        else if (name.equals("request")) {
          this.request = new Reference();
          return this.request;
        }
        else if (name.equals("outcome")) {
          throw new FHIRException("Cannot call addChild on a primitive type EnrollmentResponse.outcome");
        }
        else if (name.equals("disposition")) {
          throw new FHIRException("Cannot call addChild on a primitive type EnrollmentResponse.disposition");
        }
        else if (name.equals("created")) {
          throw new FHIRException("Cannot call addChild on a primitive type EnrollmentResponse.created");
        }
        else if (name.equals("organization")) {
          this.organization = new Reference();
          return this.organization;
        }
        else if (name.equals("requestProvider")) {
          this.requestProvider = new Reference();
          return this.requestProvider;
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "EnrollmentResponse";

  }

      public EnrollmentResponse copy() {
        EnrollmentResponse dst = new EnrollmentResponse();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EnrollmentResponse dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.request = request == null ? null : request.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.disposition = disposition == null ? null : disposition.copy();
        dst.created = created == null ? null : created.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.requestProvider = requestProvider == null ? null : requestProvider.copy();
      }

      protected EnrollmentResponse typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EnrollmentResponse))
          return false;
        EnrollmentResponse o = (EnrollmentResponse) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(request, o.request, true)
           && compareDeep(outcome, o.outcome, true) && compareDeep(disposition, o.disposition, true) && compareDeep(created, o.created, true)
           && compareDeep(organization, o.organization, true) && compareDeep(requestProvider, o.requestProvider, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EnrollmentResponse))
          return false;
        EnrollmentResponse o = (EnrollmentResponse) other_;
        return compareValues(status, o.status, true) && compareValues(outcome, o.outcome, true) && compareValues(disposition, o.disposition, true)
           && compareValues(created, o.created, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, request
          , outcome, disposition, created, organization, requestProvider);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.EnrollmentResponse;
   }

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The business identifier of the EnrollmentResponse</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EnrollmentResponse.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="EnrollmentResponse.identifier", description="The business identifier of the EnrollmentResponse", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The business identifier of the EnrollmentResponse</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EnrollmentResponse.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>request</b>
   * <p>
   * Description: <b>The reference to the claim</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EnrollmentResponse.request</b><br>
   * </p>
   */
  @SearchParamDefinition(name="request", path="EnrollmentResponse.request", description="The reference to the claim", type="reference", target={EnrollmentRequest.class } )
  public static final String SP_REQUEST = "request";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>request</b>
   * <p>
   * Description: <b>The reference to the claim</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EnrollmentResponse.request</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUEST = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REQUEST);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EnrollmentResponse:request</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUEST = new ca.uhn.fhir.model.api.Include("EnrollmentResponse:request").toLocked();

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The status of the enrollment response</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EnrollmentResponse.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="EnrollmentResponse.status", description="The status of the enrollment response", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The status of the enrollment response</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EnrollmentResponse.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);


}
