package org.hl7.fhir.dstu3.model;



/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Fri, Mar 16, 2018 15:21+1100 for FHIR v3.0.x
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGenderEnumFactory;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;

import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
/**
 * Demographics and administrative information about a person independent of a specific health-related context.
 */
@ResourceDef(name="Person", profile="http://hl7.org/fhir/Profile/Person")
public class Person extends DomainResource {

    public enum IdentityAssuranceLevel {
        /**
         * Little or no confidence in the asserted identity's accuracy.
         */
        LEVEL1, 
        /**
         * Some confidence in the asserted identity's accuracy.
         */
        LEVEL2, 
        /**
         * High confidence in the asserted identity's accuracy.
         */
        LEVEL3, 
        /**
         * Very high confidence in the asserted identity's accuracy.
         */
        LEVEL4, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static IdentityAssuranceLevel fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("level1".equals(codeString))
          return LEVEL1;
        if ("level2".equals(codeString))
          return LEVEL2;
        if ("level3".equals(codeString))
          return LEVEL3;
        if ("level4".equals(codeString))
          return LEVEL4;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown IdentityAssuranceLevel code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case LEVEL1: return "level1";
            case LEVEL2: return "level2";
            case LEVEL3: return "level3";
            case LEVEL4: return "level4";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case LEVEL1: return "http://hl7.org/fhir/identity-assuranceLevel";
            case LEVEL2: return "http://hl7.org/fhir/identity-assuranceLevel";
            case LEVEL3: return "http://hl7.org/fhir/identity-assuranceLevel";
            case LEVEL4: return "http://hl7.org/fhir/identity-assuranceLevel";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case LEVEL1: return "Little or no confidence in the asserted identity's accuracy.";
            case LEVEL2: return "Some confidence in the asserted identity's accuracy.";
            case LEVEL3: return "High confidence in the asserted identity's accuracy.";
            case LEVEL4: return "Very high confidence in the asserted identity's accuracy.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case LEVEL1: return "Level 1";
            case LEVEL2: return "Level 2";
            case LEVEL3: return "Level 3";
            case LEVEL4: return "Level 4";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class IdentityAssuranceLevelEnumFactory implements EnumFactory<IdentityAssuranceLevel> {
    public IdentityAssuranceLevel fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("level1".equals(codeString))
          return IdentityAssuranceLevel.LEVEL1;
        if ("level2".equals(codeString))
          return IdentityAssuranceLevel.LEVEL2;
        if ("level3".equals(codeString))
          return IdentityAssuranceLevel.LEVEL3;
        if ("level4".equals(codeString))
          return IdentityAssuranceLevel.LEVEL4;
        throw new IllegalArgumentException("Unknown IdentityAssuranceLevel code '"+codeString+"'");
        }
        public Enumeration<IdentityAssuranceLevel> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<IdentityAssuranceLevel>(this);
          String codeString = code.asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("level1".equals(codeString))
          return new Enumeration<IdentityAssuranceLevel>(this, IdentityAssuranceLevel.LEVEL1);
        if ("level2".equals(codeString))
          return new Enumeration<IdentityAssuranceLevel>(this, IdentityAssuranceLevel.LEVEL2);
        if ("level3".equals(codeString))
          return new Enumeration<IdentityAssuranceLevel>(this, IdentityAssuranceLevel.LEVEL3);
        if ("level4".equals(codeString))
          return new Enumeration<IdentityAssuranceLevel>(this, IdentityAssuranceLevel.LEVEL4);
        throw new FHIRException("Unknown IdentityAssuranceLevel code '"+codeString+"'");
        }
    public String toCode(IdentityAssuranceLevel code) {
      if (code == IdentityAssuranceLevel.LEVEL1)
        return "level1";
      if (code == IdentityAssuranceLevel.LEVEL2)
        return "level2";
      if (code == IdentityAssuranceLevel.LEVEL3)
        return "level3";
      if (code == IdentityAssuranceLevel.LEVEL4)
        return "level4";
      return "?";
      }
    public String toSystem(IdentityAssuranceLevel code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class PersonLinkComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The resource to which this actual person is associated.
         */
        @Child(name = "target", type = {Patient.class, Practitioner.class, RelatedPerson.class, Person.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The resource to which this actual person is associated", formalDefinition="The resource to which this actual person is associated." )
        protected Reference target;

        /**
         * The actual object that is the target of the reference (The resource to which this actual person is associated.)
         */
        protected Resource targetTarget;

        /**
         * Level of assurance that this link is actually associated with the target resource.
         */
        @Child(name = "assurance", type = {CodeType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="level1 | level2 | level3 | level4", formalDefinition="Level of assurance that this link is actually associated with the target resource." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/identity-assuranceLevel")
        protected Enumeration<IdentityAssuranceLevel> assurance;

        private static final long serialVersionUID = 508763647L;

    /**
     * Constructor
     */
      public PersonLinkComponent() {
        super();
      }

    /**
     * Constructor
     */
      public PersonLinkComponent(Reference target) {
        super();
        this.target = target;
      }

        /**
         * @return {@link #target} (The resource to which this actual person is associated.)
         */
        public Reference getTarget() { 
          if (this.target == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PersonLinkComponent.target");
            else if (Configuration.doAutoCreate())
              this.target = new Reference(); // cc
          return this.target;
        }

        public boolean hasTarget() { 
          return this.target != null && !this.target.isEmpty();
        }

        /**
         * @param value {@link #target} (The resource to which this actual person is associated.)
         */
        public PersonLinkComponent setTarget(Reference value)  { 
          this.target = value;
          return this;
        }

        /**
         * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The resource to which this actual person is associated.)
         */
        public Resource getTargetTarget() { 
          return this.targetTarget;
        }

        /**
         * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The resource to which this actual person is associated.)
         */
        public PersonLinkComponent setTargetTarget(Resource value) { 
          this.targetTarget = value;
          return this;
        }

        /**
         * @return {@link #assurance} (Level of assurance that this link is actually associated with the target resource.). This is the underlying object with id, value and extensions. The accessor "getAssurance" gives direct access to the value
         */
        public Enumeration<IdentityAssuranceLevel> getAssuranceElement() { 
          if (this.assurance == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PersonLinkComponent.assurance");
            else if (Configuration.doAutoCreate())
              this.assurance = new Enumeration<IdentityAssuranceLevel>(new IdentityAssuranceLevelEnumFactory()); // bb
          return this.assurance;
        }

        public boolean hasAssuranceElement() { 
          return this.assurance != null && !this.assurance.isEmpty();
        }

        public boolean hasAssurance() { 
          return this.assurance != null && !this.assurance.isEmpty();
        }

        /**
         * @param value {@link #assurance} (Level of assurance that this link is actually associated with the target resource.). This is the underlying object with id, value and extensions. The accessor "getAssurance" gives direct access to the value
         */
        public PersonLinkComponent setAssuranceElement(Enumeration<IdentityAssuranceLevel> value) { 
          this.assurance = value;
          return this;
        }

        /**
         * @return Level of assurance that this link is actually associated with the target resource.
         */
        public IdentityAssuranceLevel getAssurance() { 
          return this.assurance == null ? null : this.assurance.getValue();
        }

        /**
         * @param value Level of assurance that this link is actually associated with the target resource.
         */
        public PersonLinkComponent setAssurance(IdentityAssuranceLevel value) { 
          if (value == null)
            this.assurance = null;
          else {
            if (this.assurance == null)
              this.assurance = new Enumeration<IdentityAssuranceLevel>(new IdentityAssuranceLevelEnumFactory());
            this.assurance.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("target", "Reference(Patient|Practitioner|RelatedPerson|Person)", "The resource to which this actual person is associated.", 0, 1, target));
          children.add(new Property("assurance", "code", "Level of assurance that this link is actually associated with the target resource.", 0, 1, assurance));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -880905839: /*target*/  return new Property("target", "Reference(Patient|Practitioner|RelatedPerson|Person)", "The resource to which this actual person is associated.", 0, 1, target);
          case 1771900717: /*assurance*/  return new Property("assurance", "code", "Level of assurance that this link is actually associated with the target resource.", 0, 1, assurance);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -880905839: /*target*/ return this.target == null ? new Base[0] : new Base[] {this.target}; // Reference
        case 1771900717: /*assurance*/ return this.assurance == null ? new Base[0] : new Base[] {this.assurance}; // Enumeration<IdentityAssuranceLevel>
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -880905839: // target
          this.target = castToReference(value); // Reference
          return value;
        case 1771900717: // assurance
          value = new IdentityAssuranceLevelEnumFactory().fromType(castToCode(value));
          this.assurance = (Enumeration) value; // Enumeration<IdentityAssuranceLevel>
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("target")) {
          this.target = castToReference(value); // Reference
        } else if (name.equals("assurance")) {
          value = new IdentityAssuranceLevelEnumFactory().fromType(castToCode(value));
          this.assurance = (Enumeration) value; // Enumeration<IdentityAssuranceLevel>
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -880905839:  return getTarget(); 
        case 1771900717:  return getAssuranceElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -880905839: /*target*/ return new String[] {"Reference"};
        case 1771900717: /*assurance*/ return new String[] {"code"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("target")) {
          this.target = new Reference();
          return this.target;
        }
        else if (name.equals("assurance")) {
          throw new FHIRException("Cannot call addChild on a primitive type Person.assurance");
        }
        else
          return super.addChild(name);
      }

      public PersonLinkComponent copy() {
        PersonLinkComponent dst = new PersonLinkComponent();
        copyValues(dst);
        dst.target = target == null ? null : target.copy();
        dst.assurance = assurance == null ? null : assurance.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof PersonLinkComponent))
          return false;
        PersonLinkComponent o = (PersonLinkComponent) other_;
        return compareDeep(target, o.target, true) && compareDeep(assurance, o.assurance, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof PersonLinkComponent))
          return false;
        PersonLinkComponent o = (PersonLinkComponent) other_;
        return compareValues(assurance, o.assurance, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(target, assurance);
      }

  public String fhirType() {
    return "Person.link";

  }

  }

    /**
     * Identifier for a person within a particular scope.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="A human identifier for this person", formalDefinition="Identifier for a person within a particular scope." )
    protected List<Identifier> identifier;

    /**
     * A name associated with the person.
     */
    @Child(name = "name", type = {HumanName.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="A name associated with the person", formalDefinition="A name associated with the person." )
    protected List<HumanName> name;

    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     */
    @Child(name = "telecom", type = {ContactPoint.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="A contact detail for the person", formalDefinition="A contact detail for the person, e.g. a telephone number or an email address." )
    protected List<ContactPoint> telecom;

    /**
     * Administrative Gender.
     */
    @Child(name = "gender", type = {CodeType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="male | female | other | unknown", formalDefinition="Administrative Gender." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/administrative-gender")
    protected Enumeration<AdministrativeGender> gender;

    /**
     * The birth date for the person.
     */
    @Child(name = "birthDate", type = {DateType.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The date on which the person was born", formalDefinition="The birth date for the person." )
    protected DateType birthDate;

    /**
     * One or more addresses for the person.
     */
    @Child(name = "address", type = {Address.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="One or more addresses for the person", formalDefinition="One or more addresses for the person." )
    protected List<Address> address;

    /**
     * An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.
     */
    @Child(name = "photo", type = {Attachment.class}, order=6, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Image of the person", formalDefinition="An image that can be displayed as a thumbnail of the person to enhance the identification of the individual." )
    protected Attachment photo;

    /**
     * The organization that is the custodian of the person record.
     */
    @Child(name = "managingOrganization", type = {Organization.class}, order=7, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The organization that is the custodian of the person record", formalDefinition="The organization that is the custodian of the person record." )
    protected Reference managingOrganization;

    /**
     * The actual object that is the target of the reference (The organization that is the custodian of the person record.)
     */
    protected Organization managingOrganizationTarget;

    /**
     * Whether this person's record is in active use.
     */
    @Child(name = "active", type = {BooleanType.class}, order=8, min=0, max=1, modifier=true, summary=true)
    @Description(shortDefinition="This person's record is in active use", formalDefinition="Whether this person's record is in active use." )
    protected BooleanType active;

    /**
     * Link to a resource that concerns the same actual person.
     */
    @Child(name = "link", type = {}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Link to a resource that concerns the same actual person", formalDefinition="Link to a resource that concerns the same actual person." )
    protected List<PersonLinkComponent> link;

    private static final long serialVersionUID = -117464654L;

  /**
   * Constructor
   */
    public Person() {
      super();
    }

    /**
     * @return {@link #identifier} (Identifier for a person within a particular scope.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Person setIdentifier(List<Identifier> theIdentifier) { 
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

    public Person addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #name} (A name associated with the person.)
     */
    public List<HumanName> getName() { 
      if (this.name == null)
        this.name = new ArrayList<HumanName>();
      return this.name;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Person setName(List<HumanName> theName) { 
      this.name = theName;
      return this;
    }

    public boolean hasName() { 
      if (this.name == null)
        return false;
      for (HumanName item : this.name)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public HumanName addName() { //3
      HumanName t = new HumanName();
      if (this.name == null)
        this.name = new ArrayList<HumanName>();
      this.name.add(t);
      return t;
    }

    public Person addName(HumanName t) { //3
      if (t == null)
        return this;
      if (this.name == null)
        this.name = new ArrayList<HumanName>();
      this.name.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #name}, creating it if it does not already exist
     */
    public HumanName getNameFirstRep() { 
      if (getName().isEmpty()) {
        addName();
      }
      return getName().get(0);
    }

    /**
     * @return {@link #telecom} (A contact detail for the person, e.g. a telephone number or an email address.)
     */
    public List<ContactPoint> getTelecom() { 
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      return this.telecom;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Person setTelecom(List<ContactPoint> theTelecom) { 
      this.telecom = theTelecom;
      return this;
    }

    public boolean hasTelecom() { 
      if (this.telecom == null)
        return false;
      for (ContactPoint item : this.telecom)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactPoint addTelecom() { //3
      ContactPoint t = new ContactPoint();
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      this.telecom.add(t);
      return t;
    }

    public Person addTelecom(ContactPoint t) { //3
      if (t == null)
        return this;
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      this.telecom.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #telecom}, creating it if it does not already exist
     */
    public ContactPoint getTelecomFirstRep() { 
      if (getTelecom().isEmpty()) {
        addTelecom();
      }
      return getTelecom().get(0);
    }

    /**
     * @return {@link #gender} (Administrative Gender.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() { 
      if (this.gender == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Person.gender");
        else if (Configuration.doAutoCreate())
          this.gender = new Enumeration<AdministrativeGender>(new AdministrativeGenderEnumFactory()); // bb
      return this.gender;
    }

    public boolean hasGenderElement() { 
      return this.gender != null && !this.gender.isEmpty();
    }

    public boolean hasGender() { 
      return this.gender != null && !this.gender.isEmpty();
    }

    /**
     * @param value {@link #gender} (Administrative Gender.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Person setGenderElement(Enumeration<AdministrativeGender> value) { 
      this.gender = value;
      return this;
    }

    /**
     * @return Administrative Gender.
     */
    public AdministrativeGender getGender() { 
      return this.gender == null ? null : this.gender.getValue();
    }

    /**
     * @param value Administrative Gender.
     */
    public Person setGender(AdministrativeGender value) { 
      if (value == null)
        this.gender = null;
      else {
        if (this.gender == null)
          this.gender = new Enumeration<AdministrativeGender>(new AdministrativeGenderEnumFactory());
        this.gender.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #birthDate} (The birth date for the person.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public DateType getBirthDateElement() { 
      if (this.birthDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Person.birthDate");
        else if (Configuration.doAutoCreate())
          this.birthDate = new DateType(); // bb
      return this.birthDate;
    }

    public boolean hasBirthDateElement() { 
      return this.birthDate != null && !this.birthDate.isEmpty();
    }

    public boolean hasBirthDate() { 
      return this.birthDate != null && !this.birthDate.isEmpty();
    }

    /**
     * @param value {@link #birthDate} (The birth date for the person.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public Person setBirthDateElement(DateType value) { 
      this.birthDate = value;
      return this;
    }

    /**
     * @return The birth date for the person.
     */
    public Date getBirthDate() { 
      return this.birthDate == null ? null : this.birthDate.getValue();
    }

    /**
     * @param value The birth date for the person.
     */
    public Person setBirthDate(Date value) { 
      if (value == null)
        this.birthDate = null;
      else {
        if (this.birthDate == null)
          this.birthDate = new DateType();
        this.birthDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #address} (One or more addresses for the person.)
     */
    public List<Address> getAddress() { 
      if (this.address == null)
        this.address = new ArrayList<Address>();
      return this.address;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Person setAddress(List<Address> theAddress) { 
      this.address = theAddress;
      return this;
    }

    public boolean hasAddress() { 
      if (this.address == null)
        return false;
      for (Address item : this.address)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Address addAddress() { //3
      Address t = new Address();
      if (this.address == null)
        this.address = new ArrayList<Address>();
      this.address.add(t);
      return t;
    }

    public Person addAddress(Address t) { //3
      if (t == null)
        return this;
      if (this.address == null)
        this.address = new ArrayList<Address>();
      this.address.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #address}, creating it if it does not already exist
     */
    public Address getAddressFirstRep() { 
      if (getAddress().isEmpty()) {
        addAddress();
      }
      return getAddress().get(0);
    }

    /**
     * @return {@link #photo} (An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.)
     */
    public Attachment getPhoto() { 
      if (this.photo == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Person.photo");
        else if (Configuration.doAutoCreate())
          this.photo = new Attachment(); // cc
      return this.photo;
    }

    public boolean hasPhoto() { 
      return this.photo != null && !this.photo.isEmpty();
    }

    /**
     * @param value {@link #photo} (An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.)
     */
    public Person setPhoto(Attachment value)  { 
      this.photo = value;
      return this;
    }

    /**
     * @return {@link #managingOrganization} (The organization that is the custodian of the person record.)
     */
    public Reference getManagingOrganization() { 
      if (this.managingOrganization == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Person.managingOrganization");
        else if (Configuration.doAutoCreate())
          this.managingOrganization = new Reference(); // cc
      return this.managingOrganization;
    }

    public boolean hasManagingOrganization() { 
      return this.managingOrganization != null && !this.managingOrganization.isEmpty();
    }

    /**
     * @param value {@link #managingOrganization} (The organization that is the custodian of the person record.)
     */
    public Person setManagingOrganization(Reference value)  { 
      this.managingOrganization = value;
      return this;
    }

    /**
     * @return {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization that is the custodian of the person record.)
     */
    public Organization getManagingOrganizationTarget() { 
      if (this.managingOrganizationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Person.managingOrganization");
        else if (Configuration.doAutoCreate())
          this.managingOrganizationTarget = new Organization(); // aa
      return this.managingOrganizationTarget;
    }

    /**
     * @param value {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization that is the custodian of the person record.)
     */
    public Person setManagingOrganizationTarget(Organization value) { 
      this.managingOrganizationTarget = value;
      return this;
    }

    /**
     * @return {@link #active} (Whether this person's record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public BooleanType getActiveElement() { 
      if (this.active == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Person.active");
        else if (Configuration.doAutoCreate())
          this.active = new BooleanType(); // bb
      return this.active;
    }

    public boolean hasActiveElement() { 
      return this.active != null && !this.active.isEmpty();
    }

    public boolean hasActive() { 
      return this.active != null && !this.active.isEmpty();
    }

    /**
     * @param value {@link #active} (Whether this person's record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public Person setActiveElement(BooleanType value) { 
      this.active = value;
      return this;
    }

    /**
     * @return Whether this person's record is in active use.
     */
    public boolean getActive() { 
      return this.active == null || this.active.isEmpty() ? false : this.active.getValue();
    }

    /**
     * @param value Whether this person's record is in active use.
     */
    public Person setActive(boolean value) { 
        if (this.active == null)
          this.active = new BooleanType();
        this.active.setValue(value);
      return this;
    }

    /**
     * @return {@link #link} (Link to a resource that concerns the same actual person.)
     */
    public List<PersonLinkComponent> getLink() { 
      if (this.link == null)
        this.link = new ArrayList<PersonLinkComponent>();
      return this.link;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Person setLink(List<PersonLinkComponent> theLink) { 
      this.link = theLink;
      return this;
    }

    public boolean hasLink() { 
      if (this.link == null)
        return false;
      for (PersonLinkComponent item : this.link)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public PersonLinkComponent addLink() { //3
      PersonLinkComponent t = new PersonLinkComponent();
      if (this.link == null)
        this.link = new ArrayList<PersonLinkComponent>();
      this.link.add(t);
      return t;
    }

    public Person addLink(PersonLinkComponent t) { //3
      if (t == null)
        return this;
      if (this.link == null)
        this.link = new ArrayList<PersonLinkComponent>();
      this.link.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #link}, creating it if it does not already exist
     */
    public PersonLinkComponent getLinkFirstRep() { 
      if (getLink().isEmpty()) {
        addLink();
      }
      return getLink().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "Identifier for a person within a particular scope.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("name", "HumanName", "A name associated with the person.", 0, java.lang.Integer.MAX_VALUE, name));
        children.add(new Property("telecom", "ContactPoint", "A contact detail for the person, e.g. a telephone number or an email address.", 0, java.lang.Integer.MAX_VALUE, telecom));
        children.add(new Property("gender", "code", "Administrative Gender.", 0, 1, gender));
        children.add(new Property("birthDate", "date", "The birth date for the person.", 0, 1, birthDate));
        children.add(new Property("address", "Address", "One or more addresses for the person.", 0, java.lang.Integer.MAX_VALUE, address));
        children.add(new Property("photo", "Attachment", "An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.", 0, 1, photo));
        children.add(new Property("managingOrganization", "Reference(Organization)", "The organization that is the custodian of the person record.", 0, 1, managingOrganization));
        children.add(new Property("active", "boolean", "Whether this person's record is in active use.", 0, 1, active));
        children.add(new Property("link", "", "Link to a resource that concerns the same actual person.", 0, java.lang.Integer.MAX_VALUE, link));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Identifier for a person within a particular scope.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 3373707: /*name*/  return new Property("name", "HumanName", "A name associated with the person.", 0, java.lang.Integer.MAX_VALUE, name);
        case -1429363305: /*telecom*/  return new Property("telecom", "ContactPoint", "A contact detail for the person, e.g. a telephone number or an email address.", 0, java.lang.Integer.MAX_VALUE, telecom);
        case -1249512767: /*gender*/  return new Property("gender", "code", "Administrative Gender.", 0, 1, gender);
        case -1210031859: /*birthDate*/  return new Property("birthDate", "date", "The birth date for the person.", 0, 1, birthDate);
        case -1147692044: /*address*/  return new Property("address", "Address", "One or more addresses for the person.", 0, java.lang.Integer.MAX_VALUE, address);
        case 106642994: /*photo*/  return new Property("photo", "Attachment", "An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.", 0, 1, photo);
        case -2058947787: /*managingOrganization*/  return new Property("managingOrganization", "Reference(Organization)", "The organization that is the custodian of the person record.", 0, 1, managingOrganization);
        case -1422950650: /*active*/  return new Property("active", "boolean", "Whether this person's record is in active use.", 0, 1, active);
        case 3321850: /*link*/  return new Property("link", "", "Link to a resource that concerns the same actual person.", 0, java.lang.Integer.MAX_VALUE, link);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 3373707: /*name*/ return this.name == null ? new Base[0] : this.name.toArray(new Base[this.name.size()]); // HumanName
        case -1429363305: /*telecom*/ return this.telecom == null ? new Base[0] : this.telecom.toArray(new Base[this.telecom.size()]); // ContactPoint
        case -1249512767: /*gender*/ return this.gender == null ? new Base[0] : new Base[] {this.gender}; // Enumeration<AdministrativeGender>
        case -1210031859: /*birthDate*/ return this.birthDate == null ? new Base[0] : new Base[] {this.birthDate}; // DateType
        case -1147692044: /*address*/ return this.address == null ? new Base[0] : this.address.toArray(new Base[this.address.size()]); // Address
        case 106642994: /*photo*/ return this.photo == null ? new Base[0] : new Base[] {this.photo}; // Attachment
        case -2058947787: /*managingOrganization*/ return this.managingOrganization == null ? new Base[0] : new Base[] {this.managingOrganization}; // Reference
        case -1422950650: /*active*/ return this.active == null ? new Base[0] : new Base[] {this.active}; // BooleanType
        case 3321850: /*link*/ return this.link == null ? new Base[0] : this.link.toArray(new Base[this.link.size()]); // PersonLinkComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case 3373707: // name
          this.getName().add(castToHumanName(value)); // HumanName
          return value;
        case -1429363305: // telecom
          this.getTelecom().add(castToContactPoint(value)); // ContactPoint
          return value;
        case -1249512767: // gender
          value = new AdministrativeGenderEnumFactory().fromType(castToCode(value));
          this.gender = (Enumeration) value; // Enumeration<AdministrativeGender>
          return value;
        case -1210031859: // birthDate
          this.birthDate = castToDate(value); // DateType
          return value;
        case -1147692044: // address
          this.getAddress().add(castToAddress(value)); // Address
          return value;
        case 106642994: // photo
          this.photo = castToAttachment(value); // Attachment
          return value;
        case -2058947787: // managingOrganization
          this.managingOrganization = castToReference(value); // Reference
          return value;
        case -1422950650: // active
          this.active = castToBoolean(value); // BooleanType
          return value;
        case 3321850: // link
          this.getLink().add((PersonLinkComponent) value); // PersonLinkComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("name")) {
          this.getName().add(castToHumanName(value));
        } else if (name.equals("telecom")) {
          this.getTelecom().add(castToContactPoint(value));
        } else if (name.equals("gender")) {
          value = new AdministrativeGenderEnumFactory().fromType(castToCode(value));
          this.gender = (Enumeration) value; // Enumeration<AdministrativeGender>
        } else if (name.equals("birthDate")) {
          this.birthDate = castToDate(value); // DateType
        } else if (name.equals("address")) {
          this.getAddress().add(castToAddress(value));
        } else if (name.equals("photo")) {
          this.photo = castToAttachment(value); // Attachment
        } else if (name.equals("managingOrganization")) {
          this.managingOrganization = castToReference(value); // Reference
        } else if (name.equals("active")) {
          this.active = castToBoolean(value); // BooleanType
        } else if (name.equals("link")) {
          this.getLink().add((PersonLinkComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case 3373707:  return addName(); 
        case -1429363305:  return addTelecom(); 
        case -1249512767:  return getGenderElement();
        case -1210031859:  return getBirthDateElement();
        case -1147692044:  return addAddress(); 
        case 106642994:  return getPhoto(); 
        case -2058947787:  return getManagingOrganization(); 
        case -1422950650:  return getActiveElement();
        case 3321850:  return addLink(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 3373707: /*name*/ return new String[] {"HumanName"};
        case -1429363305: /*telecom*/ return new String[] {"ContactPoint"};
        case -1249512767: /*gender*/ return new String[] {"code"};
        case -1210031859: /*birthDate*/ return new String[] {"date"};
        case -1147692044: /*address*/ return new String[] {"Address"};
        case 106642994: /*photo*/ return new String[] {"Attachment"};
        case -2058947787: /*managingOrganization*/ return new String[] {"Reference"};
        case -1422950650: /*active*/ return new String[] {"boolean"};
        case 3321850: /*link*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("name")) {
          return addName();
        }
        else if (name.equals("telecom")) {
          return addTelecom();
        }
        else if (name.equals("gender")) {
          throw new FHIRException("Cannot call addChild on a primitive type Person.gender");
        }
        else if (name.equals("birthDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type Person.birthDate");
        }
        else if (name.equals("address")) {
          return addAddress();
        }
        else if (name.equals("photo")) {
          this.photo = new Attachment();
          return this.photo;
        }
        else if (name.equals("managingOrganization")) {
          this.managingOrganization = new Reference();
          return this.managingOrganization;
        }
        else if (name.equals("active")) {
          throw new FHIRException("Cannot call addChild on a primitive type Person.active");
        }
        else if (name.equals("link")) {
          return addLink();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Person";

  }

      public Person copy() {
        Person dst = new Person();
        copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        if (name != null) {
          dst.name = new ArrayList<HumanName>();
          for (HumanName i : name)
            dst.name.add(i.copy());
        };
        if (telecom != null) {
          dst.telecom = new ArrayList<ContactPoint>();
          for (ContactPoint i : telecom)
            dst.telecom.add(i.copy());
        };
        dst.gender = gender == null ? null : gender.copy();
        dst.birthDate = birthDate == null ? null : birthDate.copy();
        if (address != null) {
          dst.address = new ArrayList<Address>();
          for (Address i : address)
            dst.address.add(i.copy());
        };
        dst.photo = photo == null ? null : photo.copy();
        dst.managingOrganization = managingOrganization == null ? null : managingOrganization.copy();
        dst.active = active == null ? null : active.copy();
        if (link != null) {
          dst.link = new ArrayList<PersonLinkComponent>();
          for (PersonLinkComponent i : link)
            dst.link.add(i.copy());
        };
        return dst;
      }

      protected Person typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Person))
          return false;
        Person o = (Person) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(name, o.name, true) && compareDeep(telecom, o.telecom, true)
           && compareDeep(gender, o.gender, true) && compareDeep(birthDate, o.birthDate, true) && compareDeep(address, o.address, true)
           && compareDeep(photo, o.photo, true) && compareDeep(managingOrganization, o.managingOrganization, true)
           && compareDeep(active, o.active, true) && compareDeep(link, o.link, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Person))
          return false;
        Person o = (Person) other_;
        return compareValues(gender, o.gender, true) && compareValues(birthDate, o.birthDate, true) && compareValues(active, o.active, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, name, telecom
          , gender, birthDate, address, photo, managingOrganization, active, link);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Person;
   }

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>A person Identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Person.identifier", description="A person Identifier", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>A person Identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>address</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string fields in the Address, including line, city, state, country, postalCode, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address", path="Person.address", description="A server defined search that may match any of the string fields in the Address, including line, city, state, country, postalCode, and/or text", type="string" )
  public static final String SP_ADDRESS = "address";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string fields in the Address, including line, city, state, country, postalCode, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS);

 /**
   * Search parameter: <b>birthdate</b>
   * <p>
   * Description: <b>The person's date of birth</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Person.birthDate</b><br>
   * </p>
   */
  @SearchParamDefinition(name="birthdate", path="Person.birthDate", description="The person's date of birth", type="date" )
  public static final String SP_BIRTHDATE = "birthdate";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>birthdate</b>
   * <p>
   * Description: <b>The person's date of birth</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Person.birthDate</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam BIRTHDATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_BIRTHDATE);

 /**
   * Search parameter: <b>address-state</b>
   * <p>
   * Description: <b>A state specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address.state</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-state", path="Person.address.state", description="A state specified in an address", type="string" )
  public static final String SP_ADDRESS_STATE = "address-state";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-state</b>
   * <p>
   * Description: <b>A state specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address.state</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_STATE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS_STATE);

 /**
   * Search parameter: <b>gender</b>
   * <p>
   * Description: <b>The gender of the person</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.gender</b><br>
   * </p>
   */
  @SearchParamDefinition(name="gender", path="Person.gender", description="The gender of the person", type="token" )
  public static final String SP_GENDER = "gender";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>gender</b>
   * <p>
   * Description: <b>The gender of the person</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.gender</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam GENDER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_GENDER);

 /**
   * Search parameter: <b>practitioner</b>
   * <p>
   * Description: <b>The Person links to this Practitioner</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.link.target</b><br>
   * </p>
   */
  @SearchParamDefinition(name="practitioner", path="Person.link.target", description="The Person links to this Practitioner", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Practitioner") }, target={Practitioner.class } )
  public static final String SP_PRACTITIONER = "practitioner";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>practitioner</b>
   * <p>
   * Description: <b>The Person links to this Practitioner</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.link.target</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PRACTITIONER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PRACTITIONER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Person:practitioner</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PRACTITIONER = new ca.uhn.fhir.model.api.Include("Person:practitioner").toLocked();

 /**
   * Search parameter: <b>link</b>
   * <p>
   * Description: <b>Any link has this Patient, Person, RelatedPerson or Practitioner reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.link.target</b><br>
   * </p>
   */
  @SearchParamDefinition(name="link", path="Person.link.target", description="Any link has this Patient, Person, RelatedPerson or Practitioner reference", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="RelatedPerson") }, target={Patient.class, Person.class, Practitioner.class, RelatedPerson.class } )
  public static final String SP_LINK = "link";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>link</b>
   * <p>
   * Description: <b>Any link has this Patient, Person, RelatedPerson or Practitioner reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.link.target</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam LINK = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_LINK);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Person:link</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_LINK = new ca.uhn.fhir.model.api.Include("Person:link").toLocked();

 /**
   * Search parameter: <b>relatedperson</b>
   * <p>
   * Description: <b>The Person links to this RelatedPerson</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.link.target</b><br>
   * </p>
   */
  @SearchParamDefinition(name="relatedperson", path="Person.link.target", description="The Person links to this RelatedPerson", type="reference", target={RelatedPerson.class } )
  public static final String SP_RELATEDPERSON = "relatedperson";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>relatedperson</b>
   * <p>
   * Description: <b>The Person links to this RelatedPerson</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.link.target</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam RELATEDPERSON = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_RELATEDPERSON);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Person:relatedperson</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_RELATEDPERSON = new ca.uhn.fhir.model.api.Include("Person:relatedperson").toLocked();

 /**
   * Search parameter: <b>address-postalcode</b>
   * <p>
   * Description: <b>A postal code specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address.postalCode</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-postalcode", path="Person.address.postalCode", description="A postal code specified in an address", type="string" )
  public static final String SP_ADDRESS_POSTALCODE = "address-postalcode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-postalcode</b>
   * <p>
   * Description: <b>A postal code specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address.postalCode</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_POSTALCODE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS_POSTALCODE);

 /**
   * Search parameter: <b>address-country</b>
   * <p>
   * Description: <b>A country specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address.country</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-country", path="Person.address.country", description="A country specified in an address", type="string" )
  public static final String SP_ADDRESS_COUNTRY = "address-country";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-country</b>
   * <p>
   * Description: <b>A country specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address.country</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_COUNTRY = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS_COUNTRY);

 /**
   * Search parameter: <b>phonetic</b>
   * <p>
   * Description: <b>A portion of name using some kind of phonetic matching algorithm</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phonetic", path="Person.name", description="A portion of name using some kind of phonetic matching algorithm", type="string" )
  public static final String SP_PHONETIC = "phonetic";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phonetic</b>
   * <p>
   * Description: <b>A portion of name using some kind of phonetic matching algorithm</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PHONETIC = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_PHONETIC);

 /**
   * Search parameter: <b>phone</b>
   * <p>
   * Description: <b>A value in a phone contact</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.telecom(system=phone)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phone", path="Person.telecom.where(system='phone')", description="A value in a phone contact", type="token" )
  public static final String SP_PHONE = "phone";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phone</b>
   * <p>
   * Description: <b>A value in a phone contact</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.telecom(system=phone)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PHONE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PHONE);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>The Person links to this Patient</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.link.target</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="Person.link.target", description="The Person links to this Patient", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Patient") }, target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>The Person links to this Patient</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.link.target</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Person:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("Person:patient").toLocked();

 /**
   * Search parameter: <b>organization</b>
   * <p>
   * Description: <b>The organization at which this person record is being managed</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.managingOrganization</b><br>
   * </p>
   */
  @SearchParamDefinition(name="organization", path="Person.managingOrganization", description="The organization at which this person record is being managed", type="reference", target={Organization.class } )
  public static final String SP_ORGANIZATION = "organization";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>organization</b>
   * <p>
   * Description: <b>The organization at which this person record is being managed</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Person.managingOrganization</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ORGANIZATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ORGANIZATION);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Person:organization</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ORGANIZATION = new ca.uhn.fhir.model.api.Include("Person:organization").toLocked();

 /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name", path="Person.name", description="A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text", type="string" )
  public static final String SP_NAME = "name";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_NAME);

 /**
   * Search parameter: <b>address-use</b>
   * <p>
   * Description: <b>A use code specified in an address</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.address.use</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-use", path="Person.address.use", description="A use code specified in an address", type="token" )
  public static final String SP_ADDRESS_USE = "address-use";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-use</b>
   * <p>
   * Description: <b>A use code specified in an address</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.address.use</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ADDRESS_USE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_ADDRESS_USE);

 /**
   * Search parameter: <b>telecom</b>
   * <p>
   * Description: <b>The value in any kind of contact</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.telecom</b><br>
   * </p>
   */
  @SearchParamDefinition(name="telecom", path="Person.telecom", description="The value in any kind of contact", type="token" )
  public static final String SP_TELECOM = "telecom";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>telecom</b>
   * <p>
   * Description: <b>The value in any kind of contact</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.telecom</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TELECOM = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TELECOM);

 /**
   * Search parameter: <b>address-city</b>
   * <p>
   * Description: <b>A city specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address.city</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-city", path="Person.address.city", description="A city specified in an address", type="string" )
  public static final String SP_ADDRESS_CITY = "address-city";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-city</b>
   * <p>
   * Description: <b>A city specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Person.address.city</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_CITY = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS_CITY);

 /**
   * Search parameter: <b>email</b>
   * <p>
   * Description: <b>A value in an email contact</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.telecom(system=email)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="email", path="Person.telecom.where(system='email')", description="A value in an email contact", type="token" )
  public static final String SP_EMAIL = "email";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>email</b>
   * <p>
   * Description: <b>A value in an email contact</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Person.telecom(system=email)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam EMAIL = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_EMAIL);


}