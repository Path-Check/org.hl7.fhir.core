package org.hl7.fhir.r4b.model;


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

// Generated on Mon, Jun 13, 2022 17:19+0300 for FHIR v4.3.0

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.*;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r4b.model.Enumerations.*;
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

import org.hl7.fhir.instance.model.api.IBaseBundle;
/**
 * A container for a collection of resources.
 */
@ResourceDef(name="Bundle", profile="http://hl7.org/fhir/StructureDefinition/Bundle")
public class Bundle extends Resource implements IBaseBundle {

    public enum BundleType {
        /**
         * The bundle is a document. The first resource is a Composition.
         */
        DOCUMENT, 
        /**
         * The bundle is a message. The first resource is a MessageHeader.
         */
        MESSAGE, 
        /**
         * The bundle is a transaction - intended to be processed by a server as an atomic commit.
         */
        TRANSACTION, 
        /**
         * The bundle is a transaction response. Because the response is a transaction response, the transaction has succeeded, and all responses are error free.
         */
        TRANSACTIONRESPONSE, 
        /**
         * The bundle is a set of actions - intended to be processed by a server as a group of independent actions.
         */
        BATCH, 
        /**
         * The bundle is a batch response. Note that as a batch, some responses may indicate failure and others success.
         */
        BATCHRESPONSE, 
        /**
         * The bundle is a list of resources from a history interaction on a server.
         */
        HISTORY, 
        /**
         * The bundle is a list of resources returned as a result of a search/query interaction, operation, or message.
         */
        SEARCHSET, 
        /**
         * The bundle is a set of resources collected into a single package for ease of distribution that imposes no processing obligations or behavioral rules beyond persistence.
         */
        COLLECTION, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static BundleType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("document".equals(codeString))
          return DOCUMENT;
        if ("message".equals(codeString))
          return MESSAGE;
        if ("transaction".equals(codeString))
          return TRANSACTION;
        if ("transaction-response".equals(codeString))
          return TRANSACTIONRESPONSE;
        if ("batch".equals(codeString))
          return BATCH;
        if ("batch-response".equals(codeString))
          return BATCHRESPONSE;
        if ("history".equals(codeString))
          return HISTORY;
        if ("searchset".equals(codeString))
          return SEARCHSET;
        if ("collection".equals(codeString))
          return COLLECTION;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown BundleType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case DOCUMENT: return "document";
            case MESSAGE: return "message";
            case TRANSACTION: return "transaction";
            case TRANSACTIONRESPONSE: return "transaction-response";
            case BATCH: return "batch";
            case BATCHRESPONSE: return "batch-response";
            case HISTORY: return "history";
            case SEARCHSET: return "searchset";
            case COLLECTION: return "collection";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case DOCUMENT: return "http://hl7.org/fhir/bundle-type";
            case MESSAGE: return "http://hl7.org/fhir/bundle-type";
            case TRANSACTION: return "http://hl7.org/fhir/bundle-type";
            case TRANSACTIONRESPONSE: return "http://hl7.org/fhir/bundle-type";
            case BATCH: return "http://hl7.org/fhir/bundle-type";
            case BATCHRESPONSE: return "http://hl7.org/fhir/bundle-type";
            case HISTORY: return "http://hl7.org/fhir/bundle-type";
            case SEARCHSET: return "http://hl7.org/fhir/bundle-type";
            case COLLECTION: return "http://hl7.org/fhir/bundle-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case DOCUMENT: return "The bundle is a document. The first resource is a Composition.";
            case MESSAGE: return "The bundle is a message. The first resource is a MessageHeader.";
            case TRANSACTION: return "The bundle is a transaction - intended to be processed by a server as an atomic commit.";
            case TRANSACTIONRESPONSE: return "The bundle is a transaction response. Because the response is a transaction response, the transaction has succeeded, and all responses are error free.";
            case BATCH: return "The bundle is a set of actions - intended to be processed by a server as a group of independent actions.";
            case BATCHRESPONSE: return "The bundle is a batch response. Note that as a batch, some responses may indicate failure and others success.";
            case HISTORY: return "The bundle is a list of resources from a history interaction on a server.";
            case SEARCHSET: return "The bundle is a list of resources returned as a result of a search/query interaction, operation, or message.";
            case COLLECTION: return "The bundle is a set of resources collected into a single package for ease of distribution that imposes no processing obligations or behavioral rules beyond persistence.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case DOCUMENT: return "Document";
            case MESSAGE: return "Message";
            case TRANSACTION: return "Transaction";
            case TRANSACTIONRESPONSE: return "Transaction Response";
            case BATCH: return "Batch";
            case BATCHRESPONSE: return "Batch Response";
            case HISTORY: return "History List";
            case SEARCHSET: return "Search Results";
            case COLLECTION: return "Collection";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class BundleTypeEnumFactory implements EnumFactory<BundleType> {
    public BundleType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("document".equals(codeString))
          return BundleType.DOCUMENT;
        if ("message".equals(codeString))
          return BundleType.MESSAGE;
        if ("transaction".equals(codeString))
          return BundleType.TRANSACTION;
        if ("transaction-response".equals(codeString))
          return BundleType.TRANSACTIONRESPONSE;
        if ("batch".equals(codeString))
          return BundleType.BATCH;
        if ("batch-response".equals(codeString))
          return BundleType.BATCHRESPONSE;
        if ("history".equals(codeString))
          return BundleType.HISTORY;
        if ("searchset".equals(codeString))
          return BundleType.SEARCHSET;
        if ("collection".equals(codeString))
          return BundleType.COLLECTION;
        throw new IllegalArgumentException("Unknown BundleType code '"+codeString+"'");
        }
        public Enumeration<BundleType> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<BundleType>(this, BundleType.NULL, code);
          String codeString = code.asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<BundleType>(this, BundleType.NULL, code);
        if ("document".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.DOCUMENT, code);
        if ("message".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.MESSAGE, code);
        if ("transaction".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.TRANSACTION, code);
        if ("transaction-response".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.TRANSACTIONRESPONSE, code);
        if ("batch".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.BATCH, code);
        if ("batch-response".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.BATCHRESPONSE, code);
        if ("history".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.HISTORY, code);
        if ("searchset".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.SEARCHSET, code);
        if ("collection".equals(codeString))
          return new Enumeration<BundleType>(this, BundleType.COLLECTION, code);
        throw new FHIRException("Unknown BundleType code '"+codeString+"'");
        }
    public String toCode(BundleType code) {
      if (code == BundleType.DOCUMENT)
        return "document";
      if (code == BundleType.MESSAGE)
        return "message";
      if (code == BundleType.TRANSACTION)
        return "transaction";
      if (code == BundleType.TRANSACTIONRESPONSE)
        return "transaction-response";
      if (code == BundleType.BATCH)
        return "batch";
      if (code == BundleType.BATCHRESPONSE)
        return "batch-response";
      if (code == BundleType.HISTORY)
        return "history";
      if (code == BundleType.SEARCHSET)
        return "searchset";
      if (code == BundleType.COLLECTION)
        return "collection";
      return "?";
      }
    public String toSystem(BundleType code) {
      return code.getSystem();
      }
    }

    public enum HTTPVerb {
        /**
         * HTTP GET Command.
         */
        GET, 
        /**
         * HTTP HEAD Command.
         */
        HEAD, 
        /**
         * HTTP POST Command.
         */
        POST, 
        /**
         * HTTP PUT Command.
         */
        PUT, 
        /**
         * HTTP DELETE Command.
         */
        DELETE, 
        /**
         * HTTP PATCH Command.
         */
        PATCH, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static HTTPVerb fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("GET".equals(codeString))
          return GET;
        if ("HEAD".equals(codeString))
          return HEAD;
        if ("POST".equals(codeString))
          return POST;
        if ("PUT".equals(codeString))
          return PUT;
        if ("DELETE".equals(codeString))
          return DELETE;
        if ("PATCH".equals(codeString))
          return PATCH;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown HTTPVerb code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case GET: return "GET";
            case HEAD: return "HEAD";
            case POST: return "POST";
            case PUT: return "PUT";
            case DELETE: return "DELETE";
            case PATCH: return "PATCH";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case GET: return "http://hl7.org/fhir/http-verb";
            case HEAD: return "http://hl7.org/fhir/http-verb";
            case POST: return "http://hl7.org/fhir/http-verb";
            case PUT: return "http://hl7.org/fhir/http-verb";
            case DELETE: return "http://hl7.org/fhir/http-verb";
            case PATCH: return "http://hl7.org/fhir/http-verb";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case GET: return "HTTP GET Command.";
            case HEAD: return "HTTP HEAD Command.";
            case POST: return "HTTP POST Command.";
            case PUT: return "HTTP PUT Command.";
            case DELETE: return "HTTP DELETE Command.";
            case PATCH: return "HTTP PATCH Command.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case GET: return "GET";
            case HEAD: return "HEAD";
            case POST: return "POST";
            case PUT: return "PUT";
            case DELETE: return "DELETE";
            case PATCH: return "PATCH";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class HTTPVerbEnumFactory implements EnumFactory<HTTPVerb> {
    public HTTPVerb fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("GET".equals(codeString))
          return HTTPVerb.GET;
        if ("HEAD".equals(codeString))
          return HTTPVerb.HEAD;
        if ("POST".equals(codeString))
          return HTTPVerb.POST;
        if ("PUT".equals(codeString))
          return HTTPVerb.PUT;
        if ("DELETE".equals(codeString))
          return HTTPVerb.DELETE;
        if ("PATCH".equals(codeString))
          return HTTPVerb.PATCH;
        throw new IllegalArgumentException("Unknown HTTPVerb code '"+codeString+"'");
        }
        public Enumeration<HTTPVerb> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<HTTPVerb>(this, HTTPVerb.NULL, code);
          String codeString = code.asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<HTTPVerb>(this, HTTPVerb.NULL, code);
        if ("GET".equals(codeString))
          return new Enumeration<HTTPVerb>(this, HTTPVerb.GET, code);
        if ("HEAD".equals(codeString))
          return new Enumeration<HTTPVerb>(this, HTTPVerb.HEAD, code);
        if ("POST".equals(codeString))
          return new Enumeration<HTTPVerb>(this, HTTPVerb.POST, code);
        if ("PUT".equals(codeString))
          return new Enumeration<HTTPVerb>(this, HTTPVerb.PUT, code);
        if ("DELETE".equals(codeString))
          return new Enumeration<HTTPVerb>(this, HTTPVerb.DELETE, code);
        if ("PATCH".equals(codeString))
          return new Enumeration<HTTPVerb>(this, HTTPVerb.PATCH, code);
        throw new FHIRException("Unknown HTTPVerb code '"+codeString+"'");
        }
    public String toCode(HTTPVerb code) {
      if (code == HTTPVerb.GET)
        return "GET";
      if (code == HTTPVerb.HEAD)
        return "HEAD";
      if (code == HTTPVerb.POST)
        return "POST";
      if (code == HTTPVerb.PUT)
        return "PUT";
      if (code == HTTPVerb.DELETE)
        return "DELETE";
      if (code == HTTPVerb.PATCH)
        return "PATCH";
      return "?";
      }
    public String toSystem(HTTPVerb code) {
      return code.getSystem();
      }
    }

    public enum SearchEntryMode {
        /**
         * This resource matched the search specification.
         */
        MATCH, 
        /**
         * This resource is returned because it is referred to from another resource in the search set.
         */
        INCLUDE, 
        /**
         * An OperationOutcome that provides additional information about the processing of a search.
         */
        OUTCOME, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static SearchEntryMode fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("match".equals(codeString))
          return MATCH;
        if ("include".equals(codeString))
          return INCLUDE;
        if ("outcome".equals(codeString))
          return OUTCOME;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown SearchEntryMode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case MATCH: return "match";
            case INCLUDE: return "include";
            case OUTCOME: return "outcome";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MATCH: return "http://hl7.org/fhir/search-entry-mode";
            case INCLUDE: return "http://hl7.org/fhir/search-entry-mode";
            case OUTCOME: return "http://hl7.org/fhir/search-entry-mode";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MATCH: return "This resource matched the search specification.";
            case INCLUDE: return "This resource is returned because it is referred to from another resource in the search set.";
            case OUTCOME: return "An OperationOutcome that provides additional information about the processing of a search.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MATCH: return "Match";
            case INCLUDE: return "Include";
            case OUTCOME: return "Outcome";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class SearchEntryModeEnumFactory implements EnumFactory<SearchEntryMode> {
    public SearchEntryMode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("match".equals(codeString))
          return SearchEntryMode.MATCH;
        if ("include".equals(codeString))
          return SearchEntryMode.INCLUDE;
        if ("outcome".equals(codeString))
          return SearchEntryMode.OUTCOME;
        throw new IllegalArgumentException("Unknown SearchEntryMode code '"+codeString+"'");
        }
        public Enumeration<SearchEntryMode> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<SearchEntryMode>(this, SearchEntryMode.NULL, code);
          String codeString = code.asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<SearchEntryMode>(this, SearchEntryMode.NULL, code);
        if ("match".equals(codeString))
          return new Enumeration<SearchEntryMode>(this, SearchEntryMode.MATCH, code);
        if ("include".equals(codeString))
          return new Enumeration<SearchEntryMode>(this, SearchEntryMode.INCLUDE, code);
        if ("outcome".equals(codeString))
          return new Enumeration<SearchEntryMode>(this, SearchEntryMode.OUTCOME, code);
        throw new FHIRException("Unknown SearchEntryMode code '"+codeString+"'");
        }
    public String toCode(SearchEntryMode code) {
      if (code == SearchEntryMode.MATCH)
        return "match";
      if (code == SearchEntryMode.INCLUDE)
        return "include";
      if (code == SearchEntryMode.OUTCOME)
        return "outcome";
      return "?";
      }
    public String toSystem(SearchEntryMode code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class BundleLinkComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).
         */
        @Child(name = "relation", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="See http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1", formalDefinition="A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1)." )
        protected StringType relation;

        /**
         * The reference details for the link.
         */
        @Child(name = "url", type = {UriType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Reference details for the link", formalDefinition="The reference details for the link." )
        protected UriType url;

        private static final long serialVersionUID = -1010386066L;

    /**
     * Constructor
     */
      public BundleLinkComponent() {
        super();
      }

    /**
     * Constructor
     */
      public BundleLinkComponent(String relation, String url) {
        super();
        this.setRelation(relation);
        this.setUrl(url);
      }

        /**
         * @return {@link #relation} (A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).). This is the underlying object with id, value and extensions. The accessor "getRelation" gives direct access to the value
         */
        public StringType getRelationElement() { 
          if (this.relation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleLinkComponent.relation");
            else if (Configuration.doAutoCreate())
              this.relation = new StringType(); // bb
          return this.relation;
        }

        public boolean hasRelationElement() { 
          return this.relation != null && !this.relation.isEmpty();
        }

        public boolean hasRelation() { 
          return this.relation != null && !this.relation.isEmpty();
        }

        /**
         * @param value {@link #relation} (A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).). This is the underlying object with id, value and extensions. The accessor "getRelation" gives direct access to the value
         */
        public BundleLinkComponent setRelationElement(StringType value) { 
          this.relation = value;
          return this;
        }

        /**
         * @return A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).
         */
        public String getRelation() { 
          return this.relation == null ? null : this.relation.getValue();
        }

        /**
         * @param value A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).
         */
        public BundleLinkComponent setRelation(String value) { 
            if (this.relation == null)
              this.relation = new StringType();
            this.relation.setValue(value);
          return this;
        }

        /**
         * @return {@link #url} (The reference details for the link.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
         */
        public UriType getUrlElement() { 
          if (this.url == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleLinkComponent.url");
            else if (Configuration.doAutoCreate())
              this.url = new UriType(); // bb
          return this.url;
        }

        public boolean hasUrlElement() { 
          return this.url != null && !this.url.isEmpty();
        }

        public boolean hasUrl() { 
          return this.url != null && !this.url.isEmpty();
        }

        /**
         * @param value {@link #url} (The reference details for the link.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
         */
        public BundleLinkComponent setUrlElement(UriType value) { 
          this.url = value;
          return this;
        }

        /**
         * @return The reference details for the link.
         */
        public String getUrl() { 
          return this.url == null ? null : this.url.getValue();
        }

        /**
         * @param value The reference details for the link.
         */
        public BundleLinkComponent setUrl(String value) { 
            if (this.url == null)
              this.url = new UriType();
            this.url.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("relation", "string", "A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).", 0, 1, relation));
          children.add(new Property("url", "uri", "The reference details for the link.", 0, 1, url));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -554436100: /*relation*/  return new Property("relation", "string", "A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).", 0, 1, relation);
          case 116079: /*url*/  return new Property("url", "uri", "The reference details for the link.", 0, 1, url);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -554436100: /*relation*/ return this.relation == null ? new Base[0] : new Base[] {this.relation}; // StringType
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -554436100: // relation
          this.relation = TypeConvertor.castToString(value); // StringType
          return value;
        case 116079: // url
          this.url = TypeConvertor.castToUri(value); // UriType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("relation")) {
          this.relation = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("url")) {
          this.url = TypeConvertor.castToUri(value); // UriType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -554436100:  return getRelationElement();
        case 116079:  return getUrlElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -554436100: /*relation*/ return new String[] {"string"};
        case 116079: /*url*/ return new String[] {"uri"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("relation")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.link.relation");
        }
        else if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.link.url");
        }
        else
          return super.addChild(name);
      }

      public BundleLinkComponent copy() {
        BundleLinkComponent dst = new BundleLinkComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(BundleLinkComponent dst) {
        super.copyValues(dst);
        dst.relation = relation == null ? null : relation.copy();
        dst.url = url == null ? null : url.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof BundleLinkComponent))
          return false;
        BundleLinkComponent o = (BundleLinkComponent) other_;
        return compareDeep(relation, o.relation, true) && compareDeep(url, o.url, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof BundleLinkComponent))
          return false;
        BundleLinkComponent o = (BundleLinkComponent) other_;
        return compareValues(relation, o.relation, true) && compareValues(url, o.url, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(relation, url);
      }

  public String fhirType() {
    return "Bundle.link";

  }

  }

    @Block()
    public static class BundleEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A series of links that provide context to this entry.
         */
        @Child(name = "link", type = {BundleLinkComponent.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Links related to this entry", formalDefinition="A series of links that provide context to this entry." )
        protected List<BundleLinkComponent> link;

        /**
         * The Absolute URL for the resource.  The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: 
* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)
* Results from operations might involve resources that are not identified.
         */
        @Child(name = "fullUrl", type = {UriType.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="URI for resource (Absolute URL server address or URI for UUID/OID)", formalDefinition="The Absolute URL for the resource.  The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: \n* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)\n* Results from operations might involve resources that are not identified." )
        protected UriType fullUrl;

        /**
         * The Resource for the entry. The purpose/meaning of the resource is determined by the Bundle.type.
         */
        @Child(name = "resource", type = {Resource.class}, order=3, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="A resource in the bundle", formalDefinition="The Resource for the entry. The purpose/meaning of the resource is determined by the Bundle.type." )
        protected Resource resource;

        /**
         * Information about the search process that lead to the creation of this entry.
         */
        @Child(name = "search", type = {}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Search related information", formalDefinition="Information about the search process that lead to the creation of this entry." )
        protected BundleEntrySearchComponent search;

        /**
         * Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry.
         */
        @Child(name = "request", type = {}, order=5, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Additional execution information (transaction/batch/history)", formalDefinition="Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry." )
        protected BundleEntryRequestComponent request;

        /**
         * Indicates the results of processing the corresponding 'request' entry in the batch or transaction being responded to or what the results of an operation where when returning history.
         */
        @Child(name = "response", type = {}, order=6, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Results of execution (transaction/batch/history)", formalDefinition="Indicates the results of processing the corresponding 'request' entry in the batch or transaction being responded to or what the results of an operation where when returning history." )
        protected BundleEntryResponseComponent response;

        private static final long serialVersionUID = 517783054L;

    /**
     * Constructor
     */
      public BundleEntryComponent() {
        super();
      }

        /**
         * @return {@link #link} (A series of links that provide context to this entry.)
         */
        public List<BundleLinkComponent> getLink() { 
          if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
          return this.link;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public BundleEntryComponent setLink(List<BundleLinkComponent> theLink) { 
          this.link = theLink;
          return this;
        }

        public boolean hasLink() { 
          if (this.link == null)
            return false;
          for (BundleLinkComponent item : this.link)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public BundleLinkComponent addLink() { //3
          BundleLinkComponent t = new BundleLinkComponent();
          if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
          this.link.add(t);
          return t;
        }

        public BundleEntryComponent addLink(BundleLinkComponent t) { //3
          if (t == null)
            return this;
          if (this.link == null)
            this.link = new ArrayList<BundleLinkComponent>();
          this.link.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #link}, creating it if it does not already exist {3}
         */
        public BundleLinkComponent getLinkFirstRep() { 
          if (getLink().isEmpty()) {
            addLink();
          }
          return getLink().get(0);
        }

        /**
         * @return {@link #fullUrl} (The Absolute URL for the resource.  The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: 
* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)
* Results from operations might involve resources that are not identified.). This is the underlying object with id, value and extensions. The accessor "getFullUrl" gives direct access to the value
         */
        public UriType getFullUrlElement() { 
          if (this.fullUrl == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryComponent.fullUrl");
            else if (Configuration.doAutoCreate())
              this.fullUrl = new UriType(); // bb
          return this.fullUrl;
        }

        public boolean hasFullUrlElement() { 
          return this.fullUrl != null && !this.fullUrl.isEmpty();
        }

        public boolean hasFullUrl() { 
          return this.fullUrl != null && !this.fullUrl.isEmpty();
        }

        /**
         * @param value {@link #fullUrl} (The Absolute URL for the resource.  The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: 
* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)
* Results from operations might involve resources that are not identified.). This is the underlying object with id, value and extensions. The accessor "getFullUrl" gives direct access to the value
         */
        public BundleEntryComponent setFullUrlElement(UriType value) { 
          this.fullUrl = value;
          return this;
        }

        /**
         * @return The Absolute URL for the resource.  The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: 
* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)
* Results from operations might involve resources that are not identified.
         */
        public String getFullUrl() { 
          return this.fullUrl == null ? null : this.fullUrl.getValue();
        }

        /**
         * @param value The Absolute URL for the resource.  The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: 
* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)
* Results from operations might involve resources that are not identified.
         */
        public BundleEntryComponent setFullUrl(String value) { 
          if (Utilities.noString(value))
            this.fullUrl = null;
          else {
            if (this.fullUrl == null)
              this.fullUrl = new UriType();
            this.fullUrl.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #resource} (The Resource for the entry. The purpose/meaning of the resource is determined by the Bundle.type.)
         */
        public Resource getResource() { 
          return this.resource;
        }

        public boolean hasResource() { 
          return this.resource != null && !this.resource.isEmpty();
        }

        /**
         * @param value {@link #resource} (The Resource for the entry. The purpose/meaning of the resource is determined by the Bundle.type.)
         */
        public BundleEntryComponent setResource(Resource value) { 
          this.resource = value;
          return this;
        }

        /**
         * @return {@link #search} (Information about the search process that lead to the creation of this entry.)
         */
        public BundleEntrySearchComponent getSearch() { 
          if (this.search == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryComponent.search");
            else if (Configuration.doAutoCreate())
              this.search = new BundleEntrySearchComponent(); // cc
          return this.search;
        }

        public boolean hasSearch() { 
          return this.search != null && !this.search.isEmpty();
        }

        /**
         * @param value {@link #search} (Information about the search process that lead to the creation of this entry.)
         */
        public BundleEntryComponent setSearch(BundleEntrySearchComponent value) { 
          this.search = value;
          return this;
        }

        /**
         * @return {@link #request} (Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry.)
         */
        public BundleEntryRequestComponent getRequest() { 
          if (this.request == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryComponent.request");
            else if (Configuration.doAutoCreate())
              this.request = new BundleEntryRequestComponent(); // cc
          return this.request;
        }

        public boolean hasRequest() { 
          return this.request != null && !this.request.isEmpty();
        }

        /**
         * @param value {@link #request} (Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry.)
         */
        public BundleEntryComponent setRequest(BundleEntryRequestComponent value) { 
          this.request = value;
          return this;
        }

        /**
         * @return {@link #response} (Indicates the results of processing the corresponding 'request' entry in the batch or transaction being responded to or what the results of an operation where when returning history.)
         */
        public BundleEntryResponseComponent getResponse() { 
          if (this.response == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryComponent.response");
            else if (Configuration.doAutoCreate())
              this.response = new BundleEntryResponseComponent(); // cc
          return this.response;
        }

        public boolean hasResponse() { 
          return this.response != null && !this.response.isEmpty();
        }

        /**
         * @param value {@link #response} (Indicates the results of processing the corresponding 'request' entry in the batch or transaction being responded to or what the results of an operation where when returning history.)
         */
        public BundleEntryComponent setResponse(BundleEntryResponseComponent value) { 
          this.response = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("link", "@Bundle.link", "A series of links that provide context to this entry.", 0, java.lang.Integer.MAX_VALUE, link));
          children.add(new Property("fullUrl", "uri", "The Absolute URL for the resource.  The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: \n* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)\n* Results from operations might involve resources that are not identified.", 0, 1, fullUrl));
          children.add(new Property("resource", "Resource", "The Resource for the entry. The purpose/meaning of the resource is determined by the Bundle.type.", 0, 1, resource));
          children.add(new Property("search", "", "Information about the search process that lead to the creation of this entry.", 0, 1, search));
          children.add(new Property("request", "", "Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry.", 0, 1, request));
          children.add(new Property("response", "", "Indicates the results of processing the corresponding 'request' entry in the batch or transaction being responded to or what the results of an operation where when returning history.", 0, 1, response));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3321850: /*link*/  return new Property("link", "@Bundle.link", "A series of links that provide context to this entry.", 0, java.lang.Integer.MAX_VALUE, link);
          case -511251360: /*fullUrl*/  return new Property("fullUrl", "uri", "The Absolute URL for the resource.  The fullUrl SHALL NOT disagree with the id in the resource - i.e. if the fullUrl is not a urn:uuid, the URL shall be version-independent URL consistent with the Resource.id. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: \n* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)\n* Results from operations might involve resources that are not identified.", 0, 1, fullUrl);
          case -341064690: /*resource*/  return new Property("resource", "Resource", "The Resource for the entry. The purpose/meaning of the resource is determined by the Bundle.type.", 0, 1, resource);
          case -906336856: /*search*/  return new Property("search", "", "Information about the search process that lead to the creation of this entry.", 0, 1, search);
          case 1095692943: /*request*/  return new Property("request", "", "Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry.", 0, 1, request);
          case -340323263: /*response*/  return new Property("response", "", "Indicates the results of processing the corresponding 'request' entry in the batch or transaction being responded to or what the results of an operation where when returning history.", 0, 1, response);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3321850: /*link*/ return this.link == null ? new Base[0] : this.link.toArray(new Base[this.link.size()]); // BundleLinkComponent
        case -511251360: /*fullUrl*/ return this.fullUrl == null ? new Base[0] : new Base[] {this.fullUrl}; // UriType
        case -341064690: /*resource*/ return this.resource == null ? new Base[0] : new Base[] {this.resource}; // Resource
        case -906336856: /*search*/ return this.search == null ? new Base[0] : new Base[] {this.search}; // BundleEntrySearchComponent
        case 1095692943: /*request*/ return this.request == null ? new Base[0] : new Base[] {this.request}; // BundleEntryRequestComponent
        case -340323263: /*response*/ return this.response == null ? new Base[0] : new Base[] {this.response}; // BundleEntryResponseComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3321850: // link
          this.getLink().add((BundleLinkComponent) value); // BundleLinkComponent
          return value;
        case -511251360: // fullUrl
          this.fullUrl = TypeConvertor.castToUri(value); // UriType
          return value;
        case -341064690: // resource
          this.resource = TypeConvertor.castToResource(value); // Resource
          return value;
        case -906336856: // search
          this.search = (BundleEntrySearchComponent) value; // BundleEntrySearchComponent
          return value;
        case 1095692943: // request
          this.request = (BundleEntryRequestComponent) value; // BundleEntryRequestComponent
          return value;
        case -340323263: // response
          this.response = (BundleEntryResponseComponent) value; // BundleEntryResponseComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("link")) {
          this.getLink().add((BundleLinkComponent) value);
        } else if (name.equals("fullUrl")) {
          this.fullUrl = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("resource")) {
          this.resource = TypeConvertor.castToResource(value); // Resource
        } else if (name.equals("search")) {
          this.search = (BundleEntrySearchComponent) value; // BundleEntrySearchComponent
        } else if (name.equals("request")) {
          this.request = (BundleEntryRequestComponent) value; // BundleEntryRequestComponent
        } else if (name.equals("response")) {
          this.response = (BundleEntryResponseComponent) value; // BundleEntryResponseComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3321850:  return addLink(); 
        case -511251360:  return getFullUrlElement();
        case -341064690: throw new FHIRException("Cannot make property resource as it is not a complex type"); // Resource
        case -906336856:  return getSearch();
        case 1095692943:  return getRequest();
        case -340323263:  return getResponse();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3321850: /*link*/ return new String[] {"@Bundle.link"};
        case -511251360: /*fullUrl*/ return new String[] {"uri"};
        case -341064690: /*resource*/ return new String[] {"Resource"};
        case -906336856: /*search*/ return new String[] {};
        case 1095692943: /*request*/ return new String[] {};
        case -340323263: /*response*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("link")) {
          return addLink();
        }
        else if (name.equals("fullUrl")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.fullUrl");
        }
        else if (name.equals("resource")) {
          throw new FHIRException("Cannot call addChild on an abstract type Bundle.entry.resource");
        }
        else if (name.equals("search")) {
          this.search = new BundleEntrySearchComponent();
          return this.search;
        }
        else if (name.equals("request")) {
          this.request = new BundleEntryRequestComponent();
          return this.request;
        }
        else if (name.equals("response")) {
          this.response = new BundleEntryResponseComponent();
          return this.response;
        }
        else
          return super.addChild(name);
      }

      public BundleEntryComponent copy() {
        BundleEntryComponent dst = new BundleEntryComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(BundleEntryComponent dst) {
        super.copyValues(dst);
        if (link != null) {
          dst.link = new ArrayList<BundleLinkComponent>();
          for (BundleLinkComponent i : link)
            dst.link.add(i.copy());
        };
        dst.fullUrl = fullUrl == null ? null : fullUrl.copy();
        dst.resource = resource == null ? null : resource.copy();
        dst.search = search == null ? null : search.copy();
        dst.request = request == null ? null : request.copy();
        dst.response = response == null ? null : response.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof BundleEntryComponent))
          return false;
        BundleEntryComponent o = (BundleEntryComponent) other_;
        return compareDeep(link, o.link, true) && compareDeep(fullUrl, o.fullUrl, true) && compareDeep(resource, o.resource, true)
           && compareDeep(search, o.search, true) && compareDeep(request, o.request, true) && compareDeep(response, o.response, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof BundleEntryComponent))
          return false;
        BundleEntryComponent o = (BundleEntryComponent) other_;
        return compareValues(fullUrl, o.fullUrl, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(link, fullUrl, resource
          , search, request, response);
      }

  public String fhirType() {
    return "Bundle.entry";

  }

// added from java-adornments.txt:
/** 
   * Returns the {@link #getLink() link} which matches a given {@link BundleLinkComponent#getRelation() relation}.  
   * If no link is found which matches the given relation, returns <code>null</code>. If more than one 
   * link is found which matches the given relation, returns the first matching BundleLinkComponent. 
   *  
   * @param theRelation 
   *            The relation, such as \"next\", or \"self. See the constants such as {@link IBaseBundle#LINK_SELF} and {@link IBaseBundle#LINK_NEXT}. 
   * @return Returns a matching BundleLinkComponent, or <code>null</code> 
   * @see IBaseBundle#LINK_NEXT 
   * @see IBaseBundle#LINK_PREV 
   * @see IBaseBundle#LINK_SELF 
   */ 
  public BundleLinkComponent getLink(String theRelation) { 
    org.apache.commons.lang3.Validate.notBlank(theRelation, "theRelation may not be null or empty"); 
    for (BundleLinkComponent next : getLink()) { 
      if (theRelation.equals(next.getRelation())) { 
        return next; 
      } 
    } 
    return null; 
  } 
  
  /** 
   * Returns the {@link #getLink() link} which matches a given {@link BundleLinkComponent#getRelation() relation}.  
   * If no link is found which matches the given relation, creates a new BundleLinkComponent with the 
   * given relation and adds it to this Bundle. If more than one 
   * link is found which matches the given relation, returns the first matching BundleLinkComponent. 
   *  
   * @param theRelation 
   *            The relation, such as \"next\", or \"self. See the constants such as {@link IBaseBundle#LINK_SELF} and {@link IBaseBundle#LINK_NEXT}. 
   * @return Returns a matching BundleLinkComponent, or <code>null</code> 
   * @see IBaseBundle#LINK_NEXT 
   * @see IBaseBundle#LINK_PREV 
   * @see IBaseBundle#LINK_SELF 
   */ 
  public BundleLinkComponent getLinkOrCreate(String theRelation) { 
    org.apache.commons.lang3.Validate.notBlank(theRelation, "theRelation may not be null or empty"); 
    for (BundleLinkComponent next : getLink()) { 
      if (theRelation.equals(next.getRelation())) { 
        return next; 
      } 
    } 
    BundleLinkComponent retVal = new BundleLinkComponent(); 
    retVal.setRelation(theRelation); 
    getLink().add(retVal); 
    return retVal; 
  }
// end addition
  }

    @Block()
    public static class BundleEntrySearchComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Why this entry is in the result set - whether it's included as a match or because of an _include requirement, or to convey information or warning information about the search process.
         */
        @Child(name = "mode", type = {CodeType.class}, order=1, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="match | include | outcome - why this is in the result set", formalDefinition="Why this entry is in the result set - whether it's included as a match or because of an _include requirement, or to convey information or warning information about the search process." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/search-entry-mode")
        protected Enumeration<SearchEntryMode> mode;

        /**
         * When searching, the server's search ranking score for the entry.
         */
        @Child(name = "score", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Search ranking (between 0 and 1)", formalDefinition="When searching, the server's search ranking score for the entry." )
        protected DecimalType score;

        private static final long serialVersionUID = 837739866L;

    /**
     * Constructor
     */
      public BundleEntrySearchComponent() {
        super();
      }

        /**
         * @return {@link #mode} (Why this entry is in the result set - whether it's included as a match or because of an _include requirement, or to convey information or warning information about the search process.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public Enumeration<SearchEntryMode> getModeElement() { 
          if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntrySearchComponent.mode");
            else if (Configuration.doAutoCreate())
              this.mode = new Enumeration<SearchEntryMode>(new SearchEntryModeEnumFactory()); // bb
          return this.mode;
        }

        public boolean hasModeElement() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        public boolean hasMode() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        /**
         * @param value {@link #mode} (Why this entry is in the result set - whether it's included as a match or because of an _include requirement, or to convey information or warning information about the search process.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public BundleEntrySearchComponent setModeElement(Enumeration<SearchEntryMode> value) { 
          this.mode = value;
          return this;
        }

        /**
         * @return Why this entry is in the result set - whether it's included as a match or because of an _include requirement, or to convey information or warning information about the search process.
         */
        public SearchEntryMode getMode() { 
          return this.mode == null ? null : this.mode.getValue();
        }

        /**
         * @param value Why this entry is in the result set - whether it's included as a match or because of an _include requirement, or to convey information or warning information about the search process.
         */
        public BundleEntrySearchComponent setMode(SearchEntryMode value) { 
          if (value == null)
            this.mode = null;
          else {
            if (this.mode == null)
              this.mode = new Enumeration<SearchEntryMode>(new SearchEntryModeEnumFactory());
            this.mode.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #score} (When searching, the server's search ranking score for the entry.). This is the underlying object with id, value and extensions. The accessor "getScore" gives direct access to the value
         */
        public DecimalType getScoreElement() { 
          if (this.score == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntrySearchComponent.score");
            else if (Configuration.doAutoCreate())
              this.score = new DecimalType(); // bb
          return this.score;
        }

        public boolean hasScoreElement() { 
          return this.score != null && !this.score.isEmpty();
        }

        public boolean hasScore() { 
          return this.score != null && !this.score.isEmpty();
        }

        /**
         * @param value {@link #score} (When searching, the server's search ranking score for the entry.). This is the underlying object with id, value and extensions. The accessor "getScore" gives direct access to the value
         */
        public BundleEntrySearchComponent setScoreElement(DecimalType value) { 
          this.score = value;
          return this;
        }

        /**
         * @return When searching, the server's search ranking score for the entry.
         */
        public BigDecimal getScore() { 
          return this.score == null ? null : this.score.getValue();
        }

        /**
         * @param value When searching, the server's search ranking score for the entry.
         */
        public BundleEntrySearchComponent setScore(BigDecimal value) { 
          if (value == null)
            this.score = null;
          else {
            if (this.score == null)
              this.score = new DecimalType();
            this.score.setValue(value);
          }
          return this;
        }

        /**
         * @param value When searching, the server's search ranking score for the entry.
         */
        public BundleEntrySearchComponent setScore(long value) { 
              this.score = new DecimalType();
            this.score.setValue(value);
          return this;
        }

        /**
         * @param value When searching, the server's search ranking score for the entry.
         */
        public BundleEntrySearchComponent setScore(double value) { 
              this.score = new DecimalType();
            this.score.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("mode", "code", "Why this entry is in the result set - whether it's included as a match or because of an _include requirement, or to convey information or warning information about the search process.", 0, 1, mode));
          children.add(new Property("score", "decimal", "When searching, the server's search ranking score for the entry.", 0, 1, score));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3357091: /*mode*/  return new Property("mode", "code", "Why this entry is in the result set - whether it's included as a match or because of an _include requirement, or to convey information or warning information about the search process.", 0, 1, mode);
          case 109264530: /*score*/  return new Property("score", "decimal", "When searching, the server's search ranking score for the entry.", 0, 1, score);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3357091: /*mode*/ return this.mode == null ? new Base[0] : new Base[] {this.mode}; // Enumeration<SearchEntryMode>
        case 109264530: /*score*/ return this.score == null ? new Base[0] : new Base[] {this.score}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3357091: // mode
          value = new SearchEntryModeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.mode = (Enumeration) value; // Enumeration<SearchEntryMode>
          return value;
        case 109264530: // score
          this.score = TypeConvertor.castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("mode")) {
          value = new SearchEntryModeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.mode = (Enumeration) value; // Enumeration<SearchEntryMode>
        } else if (name.equals("score")) {
          this.score = TypeConvertor.castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3357091:  return getModeElement();
        case 109264530:  return getScoreElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3357091: /*mode*/ return new String[] {"code"};
        case 109264530: /*score*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("mode")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.search.mode");
        }
        else if (name.equals("score")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.search.score");
        }
        else
          return super.addChild(name);
      }

      public BundleEntrySearchComponent copy() {
        BundleEntrySearchComponent dst = new BundleEntrySearchComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(BundleEntrySearchComponent dst) {
        super.copyValues(dst);
        dst.mode = mode == null ? null : mode.copy();
        dst.score = score == null ? null : score.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof BundleEntrySearchComponent))
          return false;
        BundleEntrySearchComponent o = (BundleEntrySearchComponent) other_;
        return compareDeep(mode, o.mode, true) && compareDeep(score, o.score, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof BundleEntrySearchComponent))
          return false;
        BundleEntrySearchComponent o = (BundleEntrySearchComponent) other_;
        return compareValues(mode, o.mode, true) && compareValues(score, o.score, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(mode, score);
      }

  public String fhirType() {
    return "Bundle.entry.search";

  }

  }

    @Block()
    public static class BundleEntryRequestComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.
         */
        @Child(name = "method", type = {CodeType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="GET | HEAD | POST | PUT | DELETE | PATCH", formalDefinition="In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/http-verb")
        protected Enumeration<HTTPVerb> method;

        /**
         * The URL for this entry, relative to the root (the address to which the request is posted).
         */
        @Child(name = "url", type = {UriType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="URL for HTTP equivalent of this entry", formalDefinition="The URL for this entry, relative to the root (the address to which the request is posted)." )
        protected UriType url;

        /**
         * If the ETag values match, return a 304 Not Modified status. See the API documentation for ["Conditional Read"](http.html#cread).
         */
        @Child(name = "ifNoneMatch", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="For managing cache currency", formalDefinition="If the ETag values match, return a 304 Not Modified status. See the API documentation for [\"Conditional Read\"](http.html#cread)." )
        protected StringType ifNoneMatch;

        /**
         * Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
         */
        @Child(name = "ifModifiedSince", type = {InstantType.class}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="For managing cache currency", formalDefinition="Only perform the operation if the last updated date matches. See the API documentation for [\"Conditional Read\"](http.html#cread)." )
        protected InstantType ifModifiedSince;

        /**
         * Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
         */
        @Child(name = "ifMatch", type = {StringType.class}, order=5, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="For managing update contention", formalDefinition="Only perform the operation if the Etag value matches. For more information, see the API section [\"Managing Resource Contention\"](http.html#concurrency)." )
        protected StringType ifMatch;

        /**
         * Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
         */
        @Child(name = "ifNoneExist", type = {StringType.class}, order=6, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="For conditional creates", formalDefinition="Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\"Conditional Create\"](http.html#ccreate). This is just the query portion of the URL - what follows the \"?\" (not including the \"?\")." )
        protected StringType ifNoneExist;

        private static final long serialVersionUID = -1349769744L;

    /**
     * Constructor
     */
      public BundleEntryRequestComponent() {
        super();
      }

    /**
     * Constructor
     */
      public BundleEntryRequestComponent(HTTPVerb method, String url) {
        super();
        this.setMethod(method);
        this.setUrl(url);
      }

        /**
         * @return {@link #method} (In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.). This is the underlying object with id, value and extensions. The accessor "getMethod" gives direct access to the value
         */
        public Enumeration<HTTPVerb> getMethodElement() { 
          if (this.method == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryRequestComponent.method");
            else if (Configuration.doAutoCreate())
              this.method = new Enumeration<HTTPVerb>(new HTTPVerbEnumFactory()); // bb
          return this.method;
        }

        public boolean hasMethodElement() { 
          return this.method != null && !this.method.isEmpty();
        }

        public boolean hasMethod() { 
          return this.method != null && !this.method.isEmpty();
        }

        /**
         * @param value {@link #method} (In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.). This is the underlying object with id, value and extensions. The accessor "getMethod" gives direct access to the value
         */
        public BundleEntryRequestComponent setMethodElement(Enumeration<HTTPVerb> value) { 
          this.method = value;
          return this;
        }

        /**
         * @return In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.
         */
        public HTTPVerb getMethod() { 
          return this.method == null ? null : this.method.getValue();
        }

        /**
         * @param value In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.
         */
        public BundleEntryRequestComponent setMethod(HTTPVerb value) { 
            if (this.method == null)
              this.method = new Enumeration<HTTPVerb>(new HTTPVerbEnumFactory());
            this.method.setValue(value);
          return this;
        }

        /**
         * @return {@link #url} (The URL for this entry, relative to the root (the address to which the request is posted).). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
         */
        public UriType getUrlElement() { 
          if (this.url == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryRequestComponent.url");
            else if (Configuration.doAutoCreate())
              this.url = new UriType(); // bb
          return this.url;
        }

        public boolean hasUrlElement() { 
          return this.url != null && !this.url.isEmpty();
        }

        public boolean hasUrl() { 
          return this.url != null && !this.url.isEmpty();
        }

        /**
         * @param value {@link #url} (The URL for this entry, relative to the root (the address to which the request is posted).). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
         */
        public BundleEntryRequestComponent setUrlElement(UriType value) { 
          this.url = value;
          return this;
        }

        /**
         * @return The URL for this entry, relative to the root (the address to which the request is posted).
         */
        public String getUrl() { 
          return this.url == null ? null : this.url.getValue();
        }

        /**
         * @param value The URL for this entry, relative to the root (the address to which the request is posted).
         */
        public BundleEntryRequestComponent setUrl(String value) { 
            if (this.url == null)
              this.url = new UriType();
            this.url.setValue(value);
          return this;
        }

        /**
         * @return {@link #ifNoneMatch} (If the ETag values match, return a 304 Not Modified status. See the API documentation for ["Conditional Read"](http.html#cread).). This is the underlying object with id, value and extensions. The accessor "getIfNoneMatch" gives direct access to the value
         */
        public StringType getIfNoneMatchElement() { 
          if (this.ifNoneMatch == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryRequestComponent.ifNoneMatch");
            else if (Configuration.doAutoCreate())
              this.ifNoneMatch = new StringType(); // bb
          return this.ifNoneMatch;
        }

        public boolean hasIfNoneMatchElement() { 
          return this.ifNoneMatch != null && !this.ifNoneMatch.isEmpty();
        }

        public boolean hasIfNoneMatch() { 
          return this.ifNoneMatch != null && !this.ifNoneMatch.isEmpty();
        }

        /**
         * @param value {@link #ifNoneMatch} (If the ETag values match, return a 304 Not Modified status. See the API documentation for ["Conditional Read"](http.html#cread).). This is the underlying object with id, value and extensions. The accessor "getIfNoneMatch" gives direct access to the value
         */
        public BundleEntryRequestComponent setIfNoneMatchElement(StringType value) { 
          this.ifNoneMatch = value;
          return this;
        }

        /**
         * @return If the ETag values match, return a 304 Not Modified status. See the API documentation for ["Conditional Read"](http.html#cread).
         */
        public String getIfNoneMatch() { 
          return this.ifNoneMatch == null ? null : this.ifNoneMatch.getValue();
        }

        /**
         * @param value If the ETag values match, return a 304 Not Modified status. See the API documentation for ["Conditional Read"](http.html#cread).
         */
        public BundleEntryRequestComponent setIfNoneMatch(String value) { 
          if (Utilities.noString(value))
            this.ifNoneMatch = null;
          else {
            if (this.ifNoneMatch == null)
              this.ifNoneMatch = new StringType();
            this.ifNoneMatch.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #ifModifiedSince} (Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).). This is the underlying object with id, value and extensions. The accessor "getIfModifiedSince" gives direct access to the value
         */
        public InstantType getIfModifiedSinceElement() { 
          if (this.ifModifiedSince == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryRequestComponent.ifModifiedSince");
            else if (Configuration.doAutoCreate())
              this.ifModifiedSince = new InstantType(); // bb
          return this.ifModifiedSince;
        }

        public boolean hasIfModifiedSinceElement() { 
          return this.ifModifiedSince != null && !this.ifModifiedSince.isEmpty();
        }

        public boolean hasIfModifiedSince() { 
          return this.ifModifiedSince != null && !this.ifModifiedSince.isEmpty();
        }

        /**
         * @param value {@link #ifModifiedSince} (Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).). This is the underlying object with id, value and extensions. The accessor "getIfModifiedSince" gives direct access to the value
         */
        public BundleEntryRequestComponent setIfModifiedSinceElement(InstantType value) { 
          this.ifModifiedSince = value;
          return this;
        }

        /**
         * @return Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
         */
        public Date getIfModifiedSince() { 
          return this.ifModifiedSince == null ? null : this.ifModifiedSince.getValue();
        }

        /**
         * @param value Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
         */
        public BundleEntryRequestComponent setIfModifiedSince(Date value) { 
          if (value == null)
            this.ifModifiedSince = null;
          else {
            if (this.ifModifiedSince == null)
              this.ifModifiedSince = new InstantType();
            this.ifModifiedSince.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #ifMatch} (Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).). This is the underlying object with id, value and extensions. The accessor "getIfMatch" gives direct access to the value
         */
        public StringType getIfMatchElement() { 
          if (this.ifMatch == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryRequestComponent.ifMatch");
            else if (Configuration.doAutoCreate())
              this.ifMatch = new StringType(); // bb
          return this.ifMatch;
        }

        public boolean hasIfMatchElement() { 
          return this.ifMatch != null && !this.ifMatch.isEmpty();
        }

        public boolean hasIfMatch() { 
          return this.ifMatch != null && !this.ifMatch.isEmpty();
        }

        /**
         * @param value {@link #ifMatch} (Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).). This is the underlying object with id, value and extensions. The accessor "getIfMatch" gives direct access to the value
         */
        public BundleEntryRequestComponent setIfMatchElement(StringType value) { 
          this.ifMatch = value;
          return this;
        }

        /**
         * @return Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
         */
        public String getIfMatch() { 
          return this.ifMatch == null ? null : this.ifMatch.getValue();
        }

        /**
         * @param value Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
         */
        public BundleEntryRequestComponent setIfMatch(String value) { 
          if (Utilities.noString(value))
            this.ifMatch = null;
          else {
            if (this.ifMatch == null)
              this.ifMatch = new StringType();
            this.ifMatch.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #ifNoneExist} (Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").). This is the underlying object with id, value and extensions. The accessor "getIfNoneExist" gives direct access to the value
         */
        public StringType getIfNoneExistElement() { 
          if (this.ifNoneExist == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryRequestComponent.ifNoneExist");
            else if (Configuration.doAutoCreate())
              this.ifNoneExist = new StringType(); // bb
          return this.ifNoneExist;
        }

        public boolean hasIfNoneExistElement() { 
          return this.ifNoneExist != null && !this.ifNoneExist.isEmpty();
        }

        public boolean hasIfNoneExist() { 
          return this.ifNoneExist != null && !this.ifNoneExist.isEmpty();
        }

        /**
         * @param value {@link #ifNoneExist} (Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").). This is the underlying object with id, value and extensions. The accessor "getIfNoneExist" gives direct access to the value
         */
        public BundleEntryRequestComponent setIfNoneExistElement(StringType value) { 
          this.ifNoneExist = value;
          return this;
        }

        /**
         * @return Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
         */
        public String getIfNoneExist() { 
          return this.ifNoneExist == null ? null : this.ifNoneExist.getValue();
        }

        /**
         * @param value Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
         */
        public BundleEntryRequestComponent setIfNoneExist(String value) { 
          if (Utilities.noString(value))
            this.ifNoneExist = null;
          else {
            if (this.ifNoneExist == null)
              this.ifNoneExist = new StringType();
            this.ifNoneExist.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("method", "code", "In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.", 0, 1, method));
          children.add(new Property("url", "uri", "The URL for this entry, relative to the root (the address to which the request is posted).", 0, 1, url));
          children.add(new Property("ifNoneMatch", "string", "If the ETag values match, return a 304 Not Modified status. See the API documentation for [\"Conditional Read\"](http.html#cread).", 0, 1, ifNoneMatch));
          children.add(new Property("ifModifiedSince", "instant", "Only perform the operation if the last updated date matches. See the API documentation for [\"Conditional Read\"](http.html#cread).", 0, 1, ifModifiedSince));
          children.add(new Property("ifMatch", "string", "Only perform the operation if the Etag value matches. For more information, see the API section [\"Managing Resource Contention\"](http.html#concurrency).", 0, 1, ifMatch));
          children.add(new Property("ifNoneExist", "string", "Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\"Conditional Create\"](http.html#ccreate). This is just the query portion of the URL - what follows the \"?\" (not including the \"?\").", 0, 1, ifNoneExist));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1077554975: /*method*/  return new Property("method", "code", "In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.", 0, 1, method);
          case 116079: /*url*/  return new Property("url", "uri", "The URL for this entry, relative to the root (the address to which the request is posted).", 0, 1, url);
          case 171868368: /*ifNoneMatch*/  return new Property("ifNoneMatch", "string", "If the ETag values match, return a 304 Not Modified status. See the API documentation for [\"Conditional Read\"](http.html#cread).", 0, 1, ifNoneMatch);
          case -2061602860: /*ifModifiedSince*/  return new Property("ifModifiedSince", "instant", "Only perform the operation if the last updated date matches. See the API documentation for [\"Conditional Read\"](http.html#cread).", 0, 1, ifModifiedSince);
          case 1692894888: /*ifMatch*/  return new Property("ifMatch", "string", "Only perform the operation if the Etag value matches. For more information, see the API section [\"Managing Resource Contention\"](http.html#concurrency).", 0, 1, ifMatch);
          case 165155330: /*ifNoneExist*/  return new Property("ifNoneExist", "string", "Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\"Conditional Create\"](http.html#ccreate). This is just the query portion of the URL - what follows the \"?\" (not including the \"?\").", 0, 1, ifNoneExist);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1077554975: /*method*/ return this.method == null ? new Base[0] : new Base[] {this.method}; // Enumeration<HTTPVerb>
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case 171868368: /*ifNoneMatch*/ return this.ifNoneMatch == null ? new Base[0] : new Base[] {this.ifNoneMatch}; // StringType
        case -2061602860: /*ifModifiedSince*/ return this.ifModifiedSince == null ? new Base[0] : new Base[] {this.ifModifiedSince}; // InstantType
        case 1692894888: /*ifMatch*/ return this.ifMatch == null ? new Base[0] : new Base[] {this.ifMatch}; // StringType
        case 165155330: /*ifNoneExist*/ return this.ifNoneExist == null ? new Base[0] : new Base[] {this.ifNoneExist}; // StringType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1077554975: // method
          value = new HTTPVerbEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.method = (Enumeration) value; // Enumeration<HTTPVerb>
          return value;
        case 116079: // url
          this.url = TypeConvertor.castToUri(value); // UriType
          return value;
        case 171868368: // ifNoneMatch
          this.ifNoneMatch = TypeConvertor.castToString(value); // StringType
          return value;
        case -2061602860: // ifModifiedSince
          this.ifModifiedSince = TypeConvertor.castToInstant(value); // InstantType
          return value;
        case 1692894888: // ifMatch
          this.ifMatch = TypeConvertor.castToString(value); // StringType
          return value;
        case 165155330: // ifNoneExist
          this.ifNoneExist = TypeConvertor.castToString(value); // StringType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("method")) {
          value = new HTTPVerbEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.method = (Enumeration) value; // Enumeration<HTTPVerb>
        } else if (name.equals("url")) {
          this.url = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("ifNoneMatch")) {
          this.ifNoneMatch = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("ifModifiedSince")) {
          this.ifModifiedSince = TypeConvertor.castToInstant(value); // InstantType
        } else if (name.equals("ifMatch")) {
          this.ifMatch = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("ifNoneExist")) {
          this.ifNoneExist = TypeConvertor.castToString(value); // StringType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1077554975:  return getMethodElement();
        case 116079:  return getUrlElement();
        case 171868368:  return getIfNoneMatchElement();
        case -2061602860:  return getIfModifiedSinceElement();
        case 1692894888:  return getIfMatchElement();
        case 165155330:  return getIfNoneExistElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1077554975: /*method*/ return new String[] {"code"};
        case 116079: /*url*/ return new String[] {"uri"};
        case 171868368: /*ifNoneMatch*/ return new String[] {"string"};
        case -2061602860: /*ifModifiedSince*/ return new String[] {"instant"};
        case 1692894888: /*ifMatch*/ return new String[] {"string"};
        case 165155330: /*ifNoneExist*/ return new String[] {"string"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("method")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.request.method");
        }
        else if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.request.url");
        }
        else if (name.equals("ifNoneMatch")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.request.ifNoneMatch");
        }
        else if (name.equals("ifModifiedSince")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.request.ifModifiedSince");
        }
        else if (name.equals("ifMatch")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.request.ifMatch");
        }
        else if (name.equals("ifNoneExist")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.request.ifNoneExist");
        }
        else
          return super.addChild(name);
      }

      public BundleEntryRequestComponent copy() {
        BundleEntryRequestComponent dst = new BundleEntryRequestComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(BundleEntryRequestComponent dst) {
        super.copyValues(dst);
        dst.method = method == null ? null : method.copy();
        dst.url = url == null ? null : url.copy();
        dst.ifNoneMatch = ifNoneMatch == null ? null : ifNoneMatch.copy();
        dst.ifModifiedSince = ifModifiedSince == null ? null : ifModifiedSince.copy();
        dst.ifMatch = ifMatch == null ? null : ifMatch.copy();
        dst.ifNoneExist = ifNoneExist == null ? null : ifNoneExist.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof BundleEntryRequestComponent))
          return false;
        BundleEntryRequestComponent o = (BundleEntryRequestComponent) other_;
        return compareDeep(method, o.method, true) && compareDeep(url, o.url, true) && compareDeep(ifNoneMatch, o.ifNoneMatch, true)
           && compareDeep(ifModifiedSince, o.ifModifiedSince, true) && compareDeep(ifMatch, o.ifMatch, true)
           && compareDeep(ifNoneExist, o.ifNoneExist, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof BundleEntryRequestComponent))
          return false;
        BundleEntryRequestComponent o = (BundleEntryRequestComponent) other_;
        return compareValues(method, o.method, true) && compareValues(url, o.url, true) && compareValues(ifNoneMatch, o.ifNoneMatch, true)
           && compareValues(ifModifiedSince, o.ifModifiedSince, true) && compareValues(ifMatch, o.ifMatch, true)
           && compareValues(ifNoneExist, o.ifNoneExist, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(method, url, ifNoneMatch
          , ifModifiedSince, ifMatch, ifNoneExist);
      }

  public String fhirType() {
    return "Bundle.entry.request";

  }

  }

    @Block()
    public static class BundleEntryResponseComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.
         */
        @Child(name = "status", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Status response code (text optional)", formalDefinition="The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code." )
        protected StringType status;

        /**
         * The location header created by processing this operation, populated if the operation returns a location.
         */
        @Child(name = "location", type = {UriType.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The location (if the operation returns a location)", formalDefinition="The location header created by processing this operation, populated if the operation returns a location." )
        protected UriType location;

        /**
         * The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).
         */
        @Child(name = "etag", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The Etag for the resource (if relevant)", formalDefinition="The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency))." )
        protected StringType etag;

        /**
         * The date/time that the resource was modified on the server.
         */
        @Child(name = "lastModified", type = {InstantType.class}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Server's date time modified", formalDefinition="The date/time that the resource was modified on the server." )
        protected InstantType lastModified;

        /**
         * An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction.
         */
        @Child(name = "outcome", type = {Resource.class}, order=5, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="OperationOutcome with hints and warnings (for batch/transaction)", formalDefinition="An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction." )
        protected Resource outcome;

        private static final long serialVersionUID = 923278008L;

    /**
     * Constructor
     */
      public BundleEntryResponseComponent() {
        super();
      }

    /**
     * Constructor
     */
      public BundleEntryResponseComponent(String status) {
        super();
        this.setStatus(status);
      }

        /**
         * @return {@link #status} (The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
         */
        public StringType getStatusElement() { 
          if (this.status == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryResponseComponent.status");
            else if (Configuration.doAutoCreate())
              this.status = new StringType(); // bb
          return this.status;
        }

        public boolean hasStatusElement() { 
          return this.status != null && !this.status.isEmpty();
        }

        public boolean hasStatus() { 
          return this.status != null && !this.status.isEmpty();
        }

        /**
         * @param value {@link #status} (The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
         */
        public BundleEntryResponseComponent setStatusElement(StringType value) { 
          this.status = value;
          return this;
        }

        /**
         * @return The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.
         */
        public String getStatus() { 
          return this.status == null ? null : this.status.getValue();
        }

        /**
         * @param value The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.
         */
        public BundleEntryResponseComponent setStatus(String value) { 
            if (this.status == null)
              this.status = new StringType();
            this.status.setValue(value);
          return this;
        }

        /**
         * @return {@link #location} (The location header created by processing this operation, populated if the operation returns a location.). This is the underlying object with id, value and extensions. The accessor "getLocation" gives direct access to the value
         */
        public UriType getLocationElement() { 
          if (this.location == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryResponseComponent.location");
            else if (Configuration.doAutoCreate())
              this.location = new UriType(); // bb
          return this.location;
        }

        public boolean hasLocationElement() { 
          return this.location != null && !this.location.isEmpty();
        }

        public boolean hasLocation() { 
          return this.location != null && !this.location.isEmpty();
        }

        /**
         * @param value {@link #location} (The location header created by processing this operation, populated if the operation returns a location.). This is the underlying object with id, value and extensions. The accessor "getLocation" gives direct access to the value
         */
        public BundleEntryResponseComponent setLocationElement(UriType value) { 
          this.location = value;
          return this;
        }

        /**
         * @return The location header created by processing this operation, populated if the operation returns a location.
         */
        public String getLocation() { 
          return this.location == null ? null : this.location.getValue();
        }

        /**
         * @param value The location header created by processing this operation, populated if the operation returns a location.
         */
        public BundleEntryResponseComponent setLocation(String value) { 
          if (Utilities.noString(value))
            this.location = null;
          else {
            if (this.location == null)
              this.location = new UriType();
            this.location.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #etag} (The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).). This is the underlying object with id, value and extensions. The accessor "getEtag" gives direct access to the value
         */
        public StringType getEtagElement() { 
          if (this.etag == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryResponseComponent.etag");
            else if (Configuration.doAutoCreate())
              this.etag = new StringType(); // bb
          return this.etag;
        }

        public boolean hasEtagElement() { 
          return this.etag != null && !this.etag.isEmpty();
        }

        public boolean hasEtag() { 
          return this.etag != null && !this.etag.isEmpty();
        }

        /**
         * @param value {@link #etag} (The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).). This is the underlying object with id, value and extensions. The accessor "getEtag" gives direct access to the value
         */
        public BundleEntryResponseComponent setEtagElement(StringType value) { 
          this.etag = value;
          return this;
        }

        /**
         * @return The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).
         */
        public String getEtag() { 
          return this.etag == null ? null : this.etag.getValue();
        }

        /**
         * @param value The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).
         */
        public BundleEntryResponseComponent setEtag(String value) { 
          if (Utilities.noString(value))
            this.etag = null;
          else {
            if (this.etag == null)
              this.etag = new StringType();
            this.etag.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #lastModified} (The date/time that the resource was modified on the server.). This is the underlying object with id, value and extensions. The accessor "getLastModified" gives direct access to the value
         */
        public InstantType getLastModifiedElement() { 
          if (this.lastModified == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create BundleEntryResponseComponent.lastModified");
            else if (Configuration.doAutoCreate())
              this.lastModified = new InstantType(); // bb
          return this.lastModified;
        }

        public boolean hasLastModifiedElement() { 
          return this.lastModified != null && !this.lastModified.isEmpty();
        }

        public boolean hasLastModified() { 
          return this.lastModified != null && !this.lastModified.isEmpty();
        }

        /**
         * @param value {@link #lastModified} (The date/time that the resource was modified on the server.). This is the underlying object with id, value and extensions. The accessor "getLastModified" gives direct access to the value
         */
        public BundleEntryResponseComponent setLastModifiedElement(InstantType value) { 
          this.lastModified = value;
          return this;
        }

        /**
         * @return The date/time that the resource was modified on the server.
         */
        public Date getLastModified() { 
          return this.lastModified == null ? null : this.lastModified.getValue();
        }

        /**
         * @param value The date/time that the resource was modified on the server.
         */
        public BundleEntryResponseComponent setLastModified(Date value) { 
          if (value == null)
            this.lastModified = null;
          else {
            if (this.lastModified == null)
              this.lastModified = new InstantType();
            this.lastModified.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #outcome} (An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction.)
         */
        public Resource getOutcome() { 
          return this.outcome;
        }

        public boolean hasOutcome() { 
          return this.outcome != null && !this.outcome.isEmpty();
        }

        /**
         * @param value {@link #outcome} (An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction.)
         */
        public BundleEntryResponseComponent setOutcome(Resource value) { 
          this.outcome = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("status", "string", "The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.", 0, 1, status));
          children.add(new Property("location", "uri", "The location header created by processing this operation, populated if the operation returns a location.", 0, 1, location));
          children.add(new Property("etag", "string", "The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).", 0, 1, etag));
          children.add(new Property("lastModified", "instant", "The date/time that the resource was modified on the server.", 0, 1, lastModified));
          children.add(new Property("outcome", "Resource", "An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction.", 0, 1, outcome));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -892481550: /*status*/  return new Property("status", "string", "The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.", 0, 1, status);
          case 1901043637: /*location*/  return new Property("location", "uri", "The location header created by processing this operation, populated if the operation returns a location.", 0, 1, location);
          case 3123477: /*etag*/  return new Property("etag", "string", "The Etag for the resource, if the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).", 0, 1, etag);
          case 1959003007: /*lastModified*/  return new Property("lastModified", "instant", "The date/time that the resource was modified on the server.", 0, 1, lastModified);
          case -1106507950: /*outcome*/  return new Property("outcome", "Resource", "An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction.", 0, 1, outcome);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // StringType
        case 1901043637: /*location*/ return this.location == null ? new Base[0] : new Base[] {this.location}; // UriType
        case 3123477: /*etag*/ return this.etag == null ? new Base[0] : new Base[] {this.etag}; // StringType
        case 1959003007: /*lastModified*/ return this.lastModified == null ? new Base[0] : new Base[] {this.lastModified}; // InstantType
        case -1106507950: /*outcome*/ return this.outcome == null ? new Base[0] : new Base[] {this.outcome}; // Resource
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -892481550: // status
          this.status = TypeConvertor.castToString(value); // StringType
          return value;
        case 1901043637: // location
          this.location = TypeConvertor.castToUri(value); // UriType
          return value;
        case 3123477: // etag
          this.etag = TypeConvertor.castToString(value); // StringType
          return value;
        case 1959003007: // lastModified
          this.lastModified = TypeConvertor.castToInstant(value); // InstantType
          return value;
        case -1106507950: // outcome
          this.outcome = TypeConvertor.castToResource(value); // Resource
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("status")) {
          this.status = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("location")) {
          this.location = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("etag")) {
          this.etag = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("lastModified")) {
          this.lastModified = TypeConvertor.castToInstant(value); // InstantType
        } else if (name.equals("outcome")) {
          this.outcome = TypeConvertor.castToResource(value); // Resource
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -892481550:  return getStatusElement();
        case 1901043637:  return getLocationElement();
        case 3123477:  return getEtagElement();
        case 1959003007:  return getLastModifiedElement();
        case -1106507950: throw new FHIRException("Cannot make property outcome as it is not a complex type"); // Resource
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -892481550: /*status*/ return new String[] {"string"};
        case 1901043637: /*location*/ return new String[] {"uri"};
        case 3123477: /*etag*/ return new String[] {"string"};
        case 1959003007: /*lastModified*/ return new String[] {"instant"};
        case -1106507950: /*outcome*/ return new String[] {"Resource"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.response.status");
        }
        else if (name.equals("location")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.response.location");
        }
        else if (name.equals("etag")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.response.etag");
        }
        else if (name.equals("lastModified")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.entry.response.lastModified");
        }
        else if (name.equals("outcome")) {
          throw new FHIRException("Cannot call addChild on an abstract type Bundle.entry.response.outcome");
        }
        else
          return super.addChild(name);
      }

      public BundleEntryResponseComponent copy() {
        BundleEntryResponseComponent dst = new BundleEntryResponseComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(BundleEntryResponseComponent dst) {
        super.copyValues(dst);
        dst.status = status == null ? null : status.copy();
        dst.location = location == null ? null : location.copy();
        dst.etag = etag == null ? null : etag.copy();
        dst.lastModified = lastModified == null ? null : lastModified.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof BundleEntryResponseComponent))
          return false;
        BundleEntryResponseComponent o = (BundleEntryResponseComponent) other_;
        return compareDeep(status, o.status, true) && compareDeep(location, o.location, true) && compareDeep(etag, o.etag, true)
           && compareDeep(lastModified, o.lastModified, true) && compareDeep(outcome, o.outcome, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof BundleEntryResponseComponent))
          return false;
        BundleEntryResponseComponent o = (BundleEntryResponseComponent) other_;
        return compareValues(status, o.status, true) && compareValues(location, o.location, true) && compareValues(etag, o.etag, true)
           && compareValues(lastModified, o.lastModified, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(status, location, etag, lastModified
          , outcome);
      }

  public String fhirType() {
    return "Bundle.entry.response";

  }

  }

    /**
     * A persistent identifier for the bundle that won't change as a bundle is copied from server to server.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Persistent identifier for the bundle", formalDefinition="A persistent identifier for the bundle that won't change as a bundle is copied from server to server." )
    protected Identifier identifier;

    /**
     * Indicates the purpose of this bundle - how it is intended to be used.
     */
    @Child(name = "type", type = {CodeType.class}, order=1, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection", formalDefinition="Indicates the purpose of this bundle - how it is intended to be used." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/bundle-type")
    protected Enumeration<BundleType> type;

    /**
     * The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle.
     */
    @Child(name = "timestamp", type = {InstantType.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="When the bundle was assembled", formalDefinition="The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle." )
    protected InstantType timestamp;

    /**
     * If a set of search matches, this is the total number of entries of type 'match' across all pages in the search.  It does not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the Bundle.
     */
    @Child(name = "total", type = {UnsignedIntType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="If search, the total number of matches", formalDefinition="If a set of search matches, this is the total number of entries of type 'match' across all pages in the search.  It does not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the Bundle." )
    protected UnsignedIntType total;

    /**
     * A series of links that provide context to this bundle.
     */
    @Child(name = "link", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Links related to this Bundle", formalDefinition="A series of links that provide context to this bundle." )
    protected List<BundleLinkComponent> link;

    /**
     * An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).
     */
    @Child(name = "entry", type = {}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Entry in the bundle - will have a resource or information", formalDefinition="An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only)." )
    protected List<BundleEntryComponent> entry;

    /**
     * Digital Signature - base64 encoded. XML-DSig or a JWT.
     */
    @Child(name = "signature", type = {Signature.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Digital Signature", formalDefinition="Digital Signature - base64 encoded. XML-DSig or a JWT." )
    protected Signature signature;

    private static final long serialVersionUID = 1740470158L;

  /**
   * Constructor
   */
    public Bundle() {
      super();
    }

  /**
   * Constructor
   */
    public Bundle(BundleType type) {
      super();
      this.setType(type);
    }

    /**
     * @return {@link #identifier} (A persistent identifier for the bundle that won't change as a bundle is copied from server to server.)
     */
    public Identifier getIdentifier() { 
      if (this.identifier == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Bundle.identifier");
        else if (Configuration.doAutoCreate())
          this.identifier = new Identifier(); // cc
      return this.identifier;
    }

    public boolean hasIdentifier() { 
      return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (A persistent identifier for the bundle that won't change as a bundle is copied from server to server.)
     */
    public Bundle setIdentifier(Identifier value) { 
      this.identifier = value;
      return this;
    }

    /**
     * @return {@link #type} (Indicates the purpose of this bundle - how it is intended to be used.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<BundleType> getTypeElement() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Bundle.type");
        else if (Configuration.doAutoCreate())
          this.type = new Enumeration<BundleType>(new BundleTypeEnumFactory()); // bb
      return this.type;
    }

    public boolean hasTypeElement() { 
      return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Indicates the purpose of this bundle - how it is intended to be used.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Bundle setTypeElement(Enumeration<BundleType> value) { 
      this.type = value;
      return this;
    }

    /**
     * @return Indicates the purpose of this bundle - how it is intended to be used.
     */
    public BundleType getType() { 
      return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Indicates the purpose of this bundle - how it is intended to be used.
     */
    public Bundle setType(BundleType value) { 
        if (this.type == null)
          this.type = new Enumeration<BundleType>(new BundleTypeEnumFactory());
        this.type.setValue(value);
      return this;
    }

    /**
     * @return {@link #timestamp} (The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle.). This is the underlying object with id, value and extensions. The accessor "getTimestamp" gives direct access to the value
     */
    public InstantType getTimestampElement() { 
      if (this.timestamp == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Bundle.timestamp");
        else if (Configuration.doAutoCreate())
          this.timestamp = new InstantType(); // bb
      return this.timestamp;
    }

    public boolean hasTimestampElement() { 
      return this.timestamp != null && !this.timestamp.isEmpty();
    }

    public boolean hasTimestamp() { 
      return this.timestamp != null && !this.timestamp.isEmpty();
    }

    /**
     * @param value {@link #timestamp} (The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle.). This is the underlying object with id, value and extensions. The accessor "getTimestamp" gives direct access to the value
     */
    public Bundle setTimestampElement(InstantType value) { 
      this.timestamp = value;
      return this;
    }

    /**
     * @return The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle.
     */
    public Date getTimestamp() { 
      return this.timestamp == null ? null : this.timestamp.getValue();
    }

    /**
     * @param value The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle.
     */
    public Bundle setTimestamp(Date value) { 
      if (value == null)
        this.timestamp = null;
      else {
        if (this.timestamp == null)
          this.timestamp = new InstantType();
        this.timestamp.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #total} (If a set of search matches, this is the total number of entries of type 'match' across all pages in the search.  It does not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the Bundle.). This is the underlying object with id, value and extensions. The accessor "getTotal" gives direct access to the value
     */
    public UnsignedIntType getTotalElement() { 
      if (this.total == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Bundle.total");
        else if (Configuration.doAutoCreate())
          this.total = new UnsignedIntType(); // bb
      return this.total;
    }

    public boolean hasTotalElement() { 
      return this.total != null && !this.total.isEmpty();
    }

    public boolean hasTotal() { 
      return this.total != null && !this.total.isEmpty();
    }

    /**
     * @param value {@link #total} (If a set of search matches, this is the total number of entries of type 'match' across all pages in the search.  It does not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the Bundle.). This is the underlying object with id, value and extensions. The accessor "getTotal" gives direct access to the value
     */
    public Bundle setTotalElement(UnsignedIntType value) { 
      this.total = value;
      return this;
    }

    /**
     * @return If a set of search matches, this is the total number of entries of type 'match' across all pages in the search.  It does not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the Bundle.
     */
    public int getTotal() { 
      return this.total == null || this.total.isEmpty() ? 0 : this.total.getValue();
    }

    /**
     * @param value If a set of search matches, this is the total number of entries of type 'match' across all pages in the search.  It does not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the Bundle.
     */
    public Bundle setTotal(int value) { 
        if (this.total == null)
          this.total = new UnsignedIntType();
        this.total.setValue(value);
      return this;
    }

    /**
     * @return {@link #link} (A series of links that provide context to this bundle.)
     */
    public List<BundleLinkComponent> getLink() { 
      if (this.link == null)
        this.link = new ArrayList<BundleLinkComponent>();
      return this.link;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Bundle setLink(List<BundleLinkComponent> theLink) { 
      this.link = theLink;
      return this;
    }

    public boolean hasLink() { 
      if (this.link == null)
        return false;
      for (BundleLinkComponent item : this.link)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public BundleLinkComponent addLink() { //3
      BundleLinkComponent t = new BundleLinkComponent();
      if (this.link == null)
        this.link = new ArrayList<BundleLinkComponent>();
      this.link.add(t);
      return t;
    }

    public Bundle addLink(BundleLinkComponent t) { //3
      if (t == null)
        return this;
      if (this.link == null)
        this.link = new ArrayList<BundleLinkComponent>();
      this.link.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #link}, creating it if it does not already exist {3}
     */
    public BundleLinkComponent getLinkFirstRep() { 
      if (getLink().isEmpty()) {
        addLink();
      }
      return getLink().get(0);
    }

    /**
     * @return {@link #entry} (An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).)
     */
    public List<BundleEntryComponent> getEntry() { 
      if (this.entry == null)
        this.entry = new ArrayList<BundleEntryComponent>();
      return this.entry;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Bundle setEntry(List<BundleEntryComponent> theEntry) { 
      this.entry = theEntry;
      return this;
    }

    public boolean hasEntry() { 
      if (this.entry == null)
        return false;
      for (BundleEntryComponent item : this.entry)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public BundleEntryComponent addEntry() { //3
      BundleEntryComponent t = new BundleEntryComponent();
      if (this.entry == null)
        this.entry = new ArrayList<BundleEntryComponent>();
      this.entry.add(t);
      return t;
    }

    public Bundle addEntry(BundleEntryComponent t) { //3
      if (t == null)
        return this;
      if (this.entry == null)
        this.entry = new ArrayList<BundleEntryComponent>();
      this.entry.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist {3}
     */
    public BundleEntryComponent getEntryFirstRep() { 
      if (getEntry().isEmpty()) {
        addEntry();
      }
      return getEntry().get(0);
    }

    /**
     * @return {@link #signature} (Digital Signature - base64 encoded. XML-DSig or a JWT.)
     */
    public Signature getSignature() { 
      if (this.signature == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Bundle.signature");
        else if (Configuration.doAutoCreate())
          this.signature = new Signature(); // cc
      return this.signature;
    }

    public boolean hasSignature() { 
      return this.signature != null && !this.signature.isEmpty();
    }

    /**
     * @param value {@link #signature} (Digital Signature - base64 encoded. XML-DSig or a JWT.)
     */
    public Bundle setSignature(Signature value) { 
      this.signature = value;
      return this;
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A persistent identifier for the bundle that won't change as a bundle is copied from server to server.", 0, 1, identifier));
        children.add(new Property("type", "code", "Indicates the purpose of this bundle - how it is intended to be used.", 0, 1, type));
        children.add(new Property("timestamp", "instant", "The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle.", 0, 1, timestamp));
        children.add(new Property("total", "unsignedInt", "If a set of search matches, this is the total number of entries of type 'match' across all pages in the search.  It does not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the Bundle.", 0, 1, total));
        children.add(new Property("link", "", "A series of links that provide context to this bundle.", 0, java.lang.Integer.MAX_VALUE, link));
        children.add(new Property("entry", "", "An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).", 0, java.lang.Integer.MAX_VALUE, entry));
        children.add(new Property("signature", "Signature", "Digital Signature - base64 encoded. XML-DSig or a JWT.", 0, 1, signature));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A persistent identifier for the bundle that won't change as a bundle is copied from server to server.", 0, 1, identifier);
        case 3575610: /*type*/  return new Property("type", "code", "Indicates the purpose of this bundle - how it is intended to be used.", 0, 1, type);
        case 55126294: /*timestamp*/  return new Property("timestamp", "instant", "The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle.", 0, 1, timestamp);
        case 110549828: /*total*/  return new Property("total", "unsignedInt", "If a set of search matches, this is the total number of entries of type 'match' across all pages in the search.  It does not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the Bundle.", 0, 1, total);
        case 3321850: /*link*/  return new Property("link", "", "A series of links that provide context to this bundle.", 0, java.lang.Integer.MAX_VALUE, link);
        case 96667762: /*entry*/  return new Property("entry", "", "An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).", 0, java.lang.Integer.MAX_VALUE, entry);
        case 1073584312: /*signature*/  return new Property("signature", "Signature", "Digital Signature - base64 encoded. XML-DSig or a JWT.", 0, 1, signature);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : new Base[] {this.identifier}; // Identifier
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Enumeration<BundleType>
        case 55126294: /*timestamp*/ return this.timestamp == null ? new Base[0] : new Base[] {this.timestamp}; // InstantType
        case 110549828: /*total*/ return this.total == null ? new Base[0] : new Base[] {this.total}; // UnsignedIntType
        case 3321850: /*link*/ return this.link == null ? new Base[0] : this.link.toArray(new Base[this.link.size()]); // BundleLinkComponent
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // BundleEntryComponent
        case 1073584312: /*signature*/ return this.signature == null ? new Base[0] : new Base[] {this.signature}; // Signature
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.identifier = TypeConvertor.castToIdentifier(value); // Identifier
          return value;
        case 3575610: // type
          value = new BundleTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.type = (Enumeration) value; // Enumeration<BundleType>
          return value;
        case 55126294: // timestamp
          this.timestamp = TypeConvertor.castToInstant(value); // InstantType
          return value;
        case 110549828: // total
          this.total = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
          return value;
        case 3321850: // link
          this.getLink().add((BundleLinkComponent) value); // BundleLinkComponent
          return value;
        case 96667762: // entry
          this.getEntry().add((BundleEntryComponent) value); // BundleEntryComponent
          return value;
        case 1073584312: // signature
          this.signature = TypeConvertor.castToSignature(value); // Signature
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.identifier = TypeConvertor.castToIdentifier(value); // Identifier
        } else if (name.equals("type")) {
          value = new BundleTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.type = (Enumeration) value; // Enumeration<BundleType>
        } else if (name.equals("timestamp")) {
          this.timestamp = TypeConvertor.castToInstant(value); // InstantType
        } else if (name.equals("total")) {
          this.total = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
        } else if (name.equals("link")) {
          this.getLink().add((BundleLinkComponent) value);
        } else if (name.equals("entry")) {
          this.getEntry().add((BundleEntryComponent) value);
        } else if (name.equals("signature")) {
          this.signature = TypeConvertor.castToSignature(value); // Signature
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return getIdentifier();
        case 3575610:  return getTypeElement();
        case 55126294:  return getTimestampElement();
        case 110549828:  return getTotalElement();
        case 3321850:  return addLink(); 
        case 96667762:  return addEntry(); 
        case 1073584312:  return getSignature();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 3575610: /*type*/ return new String[] {"code"};
        case 55126294: /*timestamp*/ return new String[] {"instant"};
        case 110549828: /*total*/ return new String[] {"unsignedInt"};
        case 3321850: /*link*/ return new String[] {};
        case 96667762: /*entry*/ return new String[] {};
        case 1073584312: /*signature*/ return new String[] {"Signature"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          this.identifier = new Identifier();
          return this.identifier;
        }
        else if (name.equals("type")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.type");
        }
        else if (name.equals("timestamp")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.timestamp");
        }
        else if (name.equals("total")) {
          throw new FHIRException("Cannot call addChild on a primitive type Bundle.total");
        }
        else if (name.equals("link")) {
          return addLink();
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else if (name.equals("signature")) {
          this.signature = new Signature();
          return this.signature;
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Bundle";

  }

      public Bundle copy() {
        Bundle dst = new Bundle();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Bundle dst) {
        super.copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.type = type == null ? null : type.copy();
        dst.timestamp = timestamp == null ? null : timestamp.copy();
        dst.total = total == null ? null : total.copy();
        if (link != null) {
          dst.link = new ArrayList<BundleLinkComponent>();
          for (BundleLinkComponent i : link)
            dst.link.add(i.copy());
        };
        if (entry != null) {
          dst.entry = new ArrayList<BundleEntryComponent>();
          for (BundleEntryComponent i : entry)
            dst.entry.add(i.copy());
        };
        dst.signature = signature == null ? null : signature.copy();
      }

      protected Bundle typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Bundle))
          return false;
        Bundle o = (Bundle) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true) && compareDeep(timestamp, o.timestamp, true)
           && compareDeep(total, o.total, true) && compareDeep(link, o.link, true) && compareDeep(entry, o.entry, true)
           && compareDeep(signature, o.signature, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Bundle))
          return false;
        Bundle o = (Bundle) other_;
        return compareValues(type, o.type, true) && compareValues(timestamp, o.timestamp, true) && compareValues(total, o.total, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, type, timestamp
          , total, link, entry, signature);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Bundle;
   }

 /**
   * Search parameter: <b>composition</b>
   * <p>
   * Description: <b>The first resource in the bundle, if the bundle type is "document" - this is a composition, and this parameter provides access to search its contents</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Bundle.entry[0].resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name="composition", path="Bundle.entry[0].resource", description="The first resource in the bundle, if the bundle type is \"document\" - this is a composition, and this parameter provides access to search its contents", type="reference" )
  public static final String SP_COMPOSITION = "composition";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>composition</b>
   * <p>
   * Description: <b>The first resource in the bundle, if the bundle type is "document" - this is a composition, and this parameter provides access to search its contents</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Bundle.entry[0].resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam COMPOSITION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_COMPOSITION);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Bundle:composition</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_COMPOSITION = new ca.uhn.fhir.model.api.Include("Bundle:composition").toLocked();

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Persistent identifier for the bundle</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Bundle.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Bundle.identifier", description="Persistent identifier for the bundle", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Persistent identifier for the bundle</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Bundle.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>message</b>
   * <p>
   * Description: <b>The first resource in the bundle, if the bundle type is "message" - this is a message header, and this parameter provides access to search its contents</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Bundle.entry[0].resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name="message", path="Bundle.entry[0].resource", description="The first resource in the bundle, if the bundle type is \"message\" - this is a message header, and this parameter provides access to search its contents", type="reference" )
  public static final String SP_MESSAGE = "message";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>message</b>
   * <p>
   * Description: <b>The first resource in the bundle, if the bundle type is "message" - this is a message header, and this parameter provides access to search its contents</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Bundle.entry[0].resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam MESSAGE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_MESSAGE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Bundle:message</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_MESSAGE = new ca.uhn.fhir.model.api.Include("Bundle:message").toLocked();

 /**
   * Search parameter: <b>timestamp</b>
   * <p>
   * Description: <b>When the bundle was assembled</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Bundle.timestamp</b><br>
   * </p>
   */
  @SearchParamDefinition(name="timestamp", path="Bundle.timestamp", description="When the bundle was assembled", type="date" )
  public static final String SP_TIMESTAMP = "timestamp";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>timestamp</b>
   * <p>
   * Description: <b>When the bundle was assembled</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Bundle.timestamp</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam TIMESTAMP = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_TIMESTAMP);

 /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Bundle.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="type", path="Bundle.type", description="document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection", type="token" )
  public static final String SP_TYPE = "type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Bundle.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TYPE);

// Manual code (from Configuration.txt):
/** 
   * Returns the {@link #getLink() link} which matches a given {@link BundleLinkComponent#getRelation() relation}.  
   * If no link is found which matches the given relation, returns <code>null</code>. If more than one 
   * link is found which matches the given relation, returns the first matching BundleLinkComponent. 
   *  
   * @param theRelation 
   *            The relation, such as \"next\", or \"self. See the constants such as {@link IBaseBundle#LINK_SELF} and {@link IBaseBundle#LINK_NEXT}. 
   * @return Returns a matching BundleLinkComponent, or <code>null</code> 
   * @see IBaseBundle#LINK_NEXT 
   * @see IBaseBundle#LINK_PREV 
   * @see IBaseBundle#LINK_SELF 
   */ 
  public BundleLinkComponent getLink(String theRelation) { 
    org.apache.commons.lang3.Validate.notBlank(theRelation, "theRelation may not be null or empty"); 
    for (BundleLinkComponent next : getLink()) { 
      if (theRelation.equals(next.getRelation())) { 
        return next; 
      } 
    } 
    return null; 
  } 

  /** 
   * Returns the {@link #getLink() link} which matches a given {@link BundleLinkComponent#getRelation() relation}.  
   * If no link is found which matches the given relation, creates a new BundleLinkComponent with the 
   * given relation and adds it to this Bundle. If more than one 
   * link is found which matches the given relation, returns the first matching BundleLinkComponent. 
   *  
   * @param theRelation 
   *            The relation, such as \"next\", or \"self. See the constants such as {@link IBaseBundle#LINK_SELF} and {@link IBaseBundle#LINK_NEXT}. 
   * @return Returns a matching BundleLinkComponent, or <code>null</code> 
   * @see IBaseBundle#LINK_NEXT 
   * @see IBaseBundle#LINK_PREV 
   * @see IBaseBundle#LINK_SELF 
   */ 
  public BundleLinkComponent getLinkOrCreate(String theRelation) { 
    org.apache.commons.lang3.Validate.notBlank(theRelation, "theRelation may not be null or empty"); 
    for (BundleLinkComponent next : getLink()) { 
      if (theRelation.equals(next.getRelation())) { 
        return next; 
      } 
    } 
    BundleLinkComponent retVal = new BundleLinkComponent(); 
    retVal.setRelation(theRelation); 
    getLink().add(retVal); 
    return retVal; 
  }
// end addition

}
