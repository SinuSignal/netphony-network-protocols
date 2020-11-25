/** PCEP header fields values for protocol messages according to RFC 5440 and extensions
 * See http://www.iana.org/assignments/pcep/pcep.xml for updated values
 * @author Carlos Garcia Argos (cgarcia@novanotio.es)
 * @author Oscar Gonzalez de Dios (ogondio@tid.es)
 * Last update: Jun 2011
 */

package es.tid.pce.pcep.objects;

/*
 * PCEP Object Related Numbers (Object Classes, Types, TLV Types)
 * @see <a href="https://www.iana.org/assignments/pcep/pcep.xhtml#pcep-objects">IANA PCEP Objects Registry</a>
 * @see <a href="https://www.iana.org/assignments/pcep/pcep.xhtml#pcep-tlv-type-indicators">IANA PCEP TLVs Registry</a> 
 */

public class ObjectParameters {
	
	/*
	 * PCEP Standard Object Classes & Types
	 * https://www.iana.org/assignments/pcep/pcep.xhtml#pcep-objects
	 */
	
	/**
	 * Open Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_OPEN = 1;
	public static final int PCEP_OBJECT_TYPE_OPEN = 1;
	
	/**
	 * RP Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_RP = 2;
	public static final int PCEP_OBJECT_TYPE_RP = 1;
	
	/**
	 * NO-PATH Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_NOPATH = 3;
	public static final int PCEP_OBJECT_TYPE_NOPATH = 1;
	
	/**
	 * END-POINTS Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_ENDPOINTS = 4;
	public static final int PCEP_OBJECT_TYPE_ENDPOINTS_IPV4 = 1;
	public static final int PCEP_OBJECT_TYPE_ENDPOINTS_IPV6 = 2;
	public static final int PCEP_OBJECT_TYPE_P2MP_ENDPOINTS_IPV4 = 3;
	//TODO: NOT IMPLEMENTED
	public static final int PCEP_OBJECT_TYPE_P2MP_ENDPOINTS_IPV6 = 4; //RFC 8306
	//TODO: NOT IMPLEMENTED
	public static final int PCEP_OBJECT_TYPE_ENDPOINTS_GEN_EP = 5; //https://www.iana.org/go/rfc8779 
	
	/**
	 * BANDWIDTH Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_BANDWIDTH = 5;
	public static final int PCEP_OBJECT_TYPE_BANDWIDTH_REQUEST = 1;
	public static final int PCEP_OBJECT_TYPE_BANDWIDTH_EXISTING_TE_LSP= 2;
	public static final int PCEP_OBJECT_TYPE_BANDWIDTH_GEN_BW_REQUEST = 3; // https://www.iana.org/go/rfc8779
	public static final int PCEP_OBJECT_TYPE_BANDWIDTH_GEN_BW_EXISTING_TE_LSP = 4;// https://www.iana.org/go/rfc8779
	
	/**
	 * METRIC Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_METRIC = 6;
	public static final int PCEP_OBJECT_TYPE_METRIC = 1;

	/**
	 * ERO Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_ERO = 7;
	public static final int PCEP_OBJECT_TYPE_ERO = 1;
	
	/**
	 * RRO Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_RRO = 8;
	public static final int PCEP_OBJECT_TYPE_RRO = 1;
	
	/**
	 * LSPA Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_LSPA = 9;
	public static final int PCEP_OBJECT_TYPE_LSPA = 1;
	
	/**
	 * IRO Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_IRO = 10;
	public static final int PCEP_OBJECT_TYPE_IRO = 1;
	
	/**
	 * SVEC Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_SVEC = 11;
	public static final int PCEP_OBJECT_TYPE_SVEC = 1;
	
	/**
	 * NOTIFICATION Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_NOTIFICATION = 12;
	public static final int PCEP_OBJECT_TYPE_NOTIFICATION = 1;
	
	/**
	 * PCEP-ERROR Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_PCEPERROR = 13;
	public static final int PCEP_OBJECT_TYPE_PCEPERROR = 1;
	
	/**
	 * LOAD-BALANCING Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_LOADBALANCING = 14;
	public static final int PCEP_OBJECT_TYPE_LOADBALANCING = 1;
	
	/**
	 * CLOSE Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5440">RFC 5440</a>
	 */
	public static final int PCEP_OBJECT_CLASS_CLOSE = 15;
	public static final int PCEP_OBJECT_TYPE_CLOSE = 1;

	
	/**
	 * PATH KEY Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5520">RFC 5520</a>
	 */
	public static final int PCEP_OBJECT_CLASS_PATH_KEY=16;
	public static final int PCEP_OBJECT_TYPE_PATH_KEY=1;
	
	/**
	 * XRO Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5521">RFC 5521</a>
	 */
	public static final int PCEP_OBJECT_CLASS_XRO = 17;
	public static final int PCEP_OBJECT_TYPE_XRO = 1;
	
	/**
	 * MONITORING Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5886">RFC 5886</a>
	 */
	public static final int PCEP_OBJECT_CLASS_MONITORING=19;
	public static final int PCEP_OBJECT_TYPE_MONITORING=1;
	
	/**
	 * PCC-REQ-ID Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5886">RFC 5886</a>
	 */
	public static final int PCEP_OBJECT_CLASS_PCC_REQ_ID=20;
	public static final int PCEP_OBJECT_TYPE_PCC_REQ_ID_IPV4=1;
	public static final int PCEP_OBJECT_TYPE_PCC_REQ_ID_IPV6=2;
	
	/**
	 * OF Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc5541">RFC 5541</a>
	 */
	public static final int PCEP_OBJECT_CLASS_OBJECTIVE_FUNCTION = 21;
	public static final int PCEP_OBJECT_TYPE_OBJECTIVE_FUNCTION = 1;// PCEP Object types from RFC 5541
	
	/**
	 * CLASSTYPE Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5455">RFC 5455</a>
	 */
	public static final int PCEP_OBJECT_CLASS_CLASSTYPE=22;
	public static final int PCEP_OBJECT_TYPE_CLASSTYPE=1;
	
	/**
	 * GLOBAL-CONSTRAINTS Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5557">RFC 5557</a>
	 */
	public static final int PCEP_OBJECT_CLASS_GLOBAL_CONSTRAINTS=24;
	public static final int PCEP_OBJECT_TYPE_GLOBAL_CONSTRAINTS=1;

	/**
	 * PCE-ID Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5886">RFC 5886</a>
	 */
	public static final int PCEP_OBJECT_CLASS_PCE_ID=25;	
	public static final int PCEP_OBJECT_TYPE_PCE_ID_IPV4=1;
	public static final int PCEP_OBJECT_TYPE_PCE_ID_IPV6=2;
	
	/**
	 * PROC-TIME Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5886">RFC 5886</a>
	 */
	public static final int PCEP_OBJECT_CLASS_PROC_TIME=26;
	public static final int PCEP_OBJECT_TYPE_PROC_TIME=1;
	
	/**
	 * OVERLOAD Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc5886">RFC 5886</a>
	 */
	public static final int PCEP_OBJECT_CLASS_OVERLOAD=27;
	public static final int PCEP_OBJECT_TYPE_OVERLOAD=1;
	
	/**
	 * UNREACH-DESTINATION Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc8306">RFC 8306</a>
	 */
	public static final int PCEP_OBJECT_CLASS_UNREACH_DESTINATION=28;
	public static final int PCEP_OBJECT_TYPE_UNREACH_DESTINATION_IPV4=1;
	public static final int PCEP_OBJECT_TYPE_UNREACH_DESTINATION_IPV6=2;
	
	/**
	 * SERO Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc8306">RFC 8306</a>
	 */
	public static final int PCEP_OBJECT_CLASS_SR_ERO = 29;
	public static final int PCEP_OBJECT_TYPE_SR_ERO = 1;
	
	/**
	 * SRRO Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc8306">RFC 8306</a>
	 */
	public static final int PCEP_OBJECT_CLASS_SRRO=30;
	
	
	/**
	 * BNC Object Class
	 * TODO: NOT IMPLEMENTED
	 * @see <a href="https://tools.ietf.org/html/rfc8306">RFC 8306</a>
	 */ 
	public static final int PCEP_OBJECT_CLASS_BNC=31;
	public static final int PCEP_OBJECT_TYPE_BNC=1;
	
	/**
	 * LSP Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc8231">RFC 8231</a>
	 */ 
    public static final int PCEP_OBJECT_CLASS_LSP = 32; 
    public static final int PCEP_OBJECT_TYPE_LSP = 1;
    
	/**
	 * SRP Object Class
	 * @see <a href="https://tools.ietf.org/html/rfc8231">RFC 8231</a>
	 */ 
    public static final int PCEP_OBJECT_CLASS_SRP = 33;
    public static final int PCEP_OBJECT_TYPE_SRP = 1;
    
    //VENDOR_INFORMATION class NOT IMPLEMENTED
    public static final int PCEP_OBJECT_CLASS_VENDOR_INFORMATION = 34;
    //BU class NOT IMPLEMENTED
    public static final int PCEP_OBJECT_CLASS_BU = 34;
	// inter-layer
	public static final int PCEP_OBJECT_CLASS_INTER_LAYER=36;
	// switch-layer
	public static final int PCEP_OBJECT_CLASS_SWITCH_LAYER=37;
	// req-adap-ca
	public static final int PCEP_OBJECT_CLASS_REQ_ADAP_CAP=38;
	// SERVER_INDICATION NOT IMPLEMENTED
    public static final int PCEP_OBJECT_CLASS_SERVER_INDICATION=39;
    // ASSOCIATION NOT IMPLEMENTED
    public static final int PCEP_OBJECT_CLASS_SERVER_ASSOCIATION=40;
    // S2LS NOT IMPLEMENTED
    public static final int PCEP_OBJECT_CLASS_S2LS=41;
    // Wavelength assignment
	public static final int PCEP_OBJECT_CLASS_WAVELENGTH_ASSIGNEMENT=42;
	// Flow_spec NOT IMPLEMENTED
    public static final int PCEP_OBJECT_CLASS_FLOWSPEC=43;
	

	
	
	
	
	
	/*
	 * CLOSE reasons
	 */
	public static final int REASON_NOEXPLANATION = 1;
	public static final int REASON_DEADTIMER = 2;
	public static final int REASON_MALFORMED = 3;
	public static final int REASON_UNKNOWN = 4;
	public static final int REASON_UNRECOGNIZED = 5;
	
	/*
	 * ERROR types
	 */
	public static final int ERROR_ESTABLISHMENT = 1;
	public static final int ERROR_CAPABILITY = 2;
	public static final int ERROR_UNKNOWNOBJECT = 3;
	public static final int ERROR_UNSUPPORTEDOBJECT = 4;
	public static final int ERROR_POLICY = 5;
	public static final int ERROR_MISSINGOBJECT = 6;
	public static final int ERROR_MISSINGREQUEST = 7;
	public static final int ERROR_UNKNOWNREQUEST = 8;
	public static final int ERROR_SECONDSESSION = 9;
	public static final int ERROR_INVALIDOBJECT = 10;
	
	
	public static final int ERROR_INVALID_OPERATION = 19;
	public static final int ERROR_LSP_SYNC = 20;
	
	/*
	 * ERROR values
	 */
	//ESTABLISHMENT ERRORS
	
	public static final int ERROR_LSP_OBJECT_MISSING=8;
	public static final int ERROR_LSP_DB_VERSION_MISSING=12;
	public static final int ERROR_STATEFUL_CAPABILITY_NOT_SUPPORTED=555;
	public static final int ERROR_DELEGATION_NOT_NEGOTIATED=556;
	
	
	public static final int ERROR_ESTABLISHMENT_INVALID_OPEN_MESSAGE=0x01;
	public static final int ERROR_ESTABLISHMENT_NO_OPEN_MESSAGE=0x02;
	public static final int ERROR_ESTABLISHMENT_UNACCEPTABLE_NON_NEGOTIABLE_SESSION_CHARACTERISTICS=0x03;
	public static final int ERROR_ESTABLISHMENT_UNACCEPTABLE_NEGOTIABLE_SESSION_CHARACTERISTICS=0x04;
	public static final int ERROR_ESTABLISHMENT_SECOND_OPEN_MESSAGE_UNACCEPTABLE_SESSION_CHARACTERISTICS=0x05;
	public static final int ERROR_ESTABLISHMENT_PCERR_UNACCEPTABLE_SESSION_CHARACTERISTICS=0x06;
	/* Error-value=7: No Keepalive or PCErr message received
                       before the expiration of the KeepWait timer
	 */
	public static final int ERROR_ESTABLISHMENT_NO_KA_OR_ERROR_KEEPWAIT_TIMER=0x07;
	//UNKNOWN OBJECT
	public static final int ERROR_UNKNOWNOBJECT_UNRECOGNIZED_OBJECT_CLASS=0x01;
	public static final int ERROR_UNKNOWNOBJECT_UNRECOGNIZED_OBJECT_TYPE=0x02;
	//NOT SUPPORTED OBJECT
	public static final int ERROR_UNSUPPORTEDOBJECT_NOT_SUPPORTED_OBJECT_CLASS=0x01;
	public static final int ERROR_UNSUPPORTEDOBJECT_NOT_SUPPORTED_OBJECT_TYPE=0x02;
	/**FROM RFC 5441
	 Error-Type     Meaning and error values                 Reference
     4           Not supported object

                 Error-value=4: Unsupported parameter     This document
*/
	public static final int ERROR_UNSUPPORTEDOBJECT_UNSUPPORTED_PARAMETER=0x04;
	/*Policy violation
     Error-value=1: C bit of the METRIC object set (request rejected)
     Error-value=2: O bit of the RP object set (request rejected)
     */ 
	public static final int ERROR_POLICY_C_BIT_METRIC_SET_REQ_REJ=0x01;
	public static final int ERROR_POLICY_O_BIT_RP_SET_REQ_REJ=0x02;
    /*  Mandatory Object missing
     Error-value=1: RP object missing
     Error-value=2: RRO object missing for a reoptimization
                    request (R bit of the RP object set)
                    when bandwidth is not equal to 0.
     Error-value=3: END-POINTS object missing
	 */
	public static final int ERROR_MISSINGOBJECT_RP=0x01;
	public static final int ERROR_MISSINGOBJECT_RR0=0x02;
	public static final int ERROR_MISSINGOBJECT_END_POINTS=0x03;
	/*
	*   10         Reception of an invalid object
                  Error-value=1: reception of an object with P flag not
                  set although the P flag must be set according to this
                  specification.
	 */
	public static final int ERROR_INVALIDOBJECT_P_FLAG_NOT_SET=0x01;
	
	/** 
	 * From RFC 5541
	 * Two new Error-values are defined for the Error-type "policy
   violation" (type 5):

      Error-type      Meaning and error values                 Reference
      ------------------------------------------------------------------
         5            Policy violation

                      Error-value=3: objective function not     RFC 5541
                      allowed (request rejected)

                      Error-value=4: OF bit of the RP object    RFC 5541
                      set (request rejected)
	 */
	public static final int ERROR_POLICY_VIOLATION_OF_NOT_ALLOWED=3;
	public static final int ERROR_POLICY_VIOLATION_OF_BIT_SET=4;

	
	/*
	 * Routing Object types (ERO, RRO, IRO)
	 */
	public static final int RO_IPV4 = 1;
	public static final int RO_IPV6 = 2;
	public static final int RO_UNNUMBERED = 4;
	public static final int RO_AS = 32;
	
	/*
	 * NO PATH Reasons
	 */
	public static final int NOPATH_NOPATH_SAT_CONSTRAINTS=0x00;
	public static final int NOPATH_PCE_CHAIN_BROKEN=0x01;
	
	/*
 * Standard PCEP TLVs https://www.iana.org/assignments/pcep/pcep.xhtml#pcep-tlv-type-indicators  
1	NO-PATH-VECTOR TLV	[RFC5440]
2	OVERLOAD-DURATION TLV	[RFC5440]
3	REQ-MISSING TLV	[RFC5440]
4	OF-List	[RFC5541]
5	Order TLV	[RFC5557]
6	P2MP capable	[RFC8306]
7	VENDOR-INFORMATION-TLV	[RFC7470]
8	Wavelength Selection	[RFC8780]
9	Wavelength Restriction	[RFC8780]
10	Wavelength Allocation	[RFC8780]
11	Optical Interface Class List	[RFC8780]
12	Client Signal Information	[RFC8780]
13	H-PCE-CAPABILITY	[RFC8685]
14	Domain-ID	[RFC8685]
15	H-PCE-FLAG	[RFC8685]
16	STATEFUL-PCE-CAPABILITY	[RFC8231]
17	SYMBOLIC-PATH-NAME	[RFC8231]
18	IPV4-LSP-IDENTIFIERS	[RFC8231]
19	IPV6-LSP-IDENTIFIERS	[RFC8231]
20	LSP-ERROR-CODE	[RFC8231]
21	RSVP-ERROR-SPEC	[RFC8231]
22	Unassigned	
23	LSP-DB-VERSION	[RFC8232]
24	SPEAKER-ENTITY-ID	[RFC8232]
25	Unassigned	
26	SR-PCE-CAPABILITY (deprecated)	[RFC8664]
27	Unassigned	
28	PATH-SETUP-TYPE	[RFC8408]
29	Operator-configured Association Range	[RFC8697]
30	Global Association Source	[RFC8697]
31	Extended Association ID	[RFC8697]
32	P2MP-IPV4-LSP-IDENTIFIERS	[RFC8623]
33	P2MP-IPV6-LSP-IDENTIFIERS	[RFC8623]
34	PATH-SETUP-TYPE-CAPABILITY	[RFC8408]
35	ASSOC-Type-List	[RFC8697]
36	AUTO-BANDWIDTH-CAPABILITY	[RFC8733]
37	AUTO-BANDWIDTH-ATTRIBUTES	[RFC8733]
38	Path Protection Association Group TLV	[RFC8745]
39	IPV4-ADDRESS	[RFC8779, Section 2.5.2.1]
40	IPV6-ADDRESS	[RFC8779, Section 2.5.2.2]
41	UNNUMBERED-ENDPOINT	[RFC8779, Section 2.5.2.3]
42	LABEL-REQUEST	[RFC8779, Section 2.5.2.4]
43	LABEL-SET	[RFC8779, Section 2.5.2.5]
44	PROTECTION-ATTRIBUTE	[RFC8779, Section 2.8]
45	GMPLS-CAPABILITY	[RFC8779, Section 2.1.2]
46	DISJOINTNESS-CONFIGURATION	[RFC8800]
47	DISJOINTNESS-STATUS	[RFC8800]
48	POLICY-PARAMETERS-TLV (TEMPORARY - registered 2020-05-15, expires 2021-05-15)	[draft-ietf-pce-association-policy-09]
49	SCHED-LSP-ATTRIBUTE	[RFC8934]
50	SCHED-PD-LSP-ATTRIBUTE	[RFC8934]
51	PCE-FLOWSPEC-CAPABILITY TLV	[RFC-ietf-pce-pcep-flowspec-12]
52	FLOW FILTER TLV	[RFC-ietf-pce-pcep-flowspec-12]
53	L2 FLOW FILTER TLV	[RFC-ietf-pce-pcep-flowspec-12]
	 */
    /**
    * 1	NO-PATH-VECTOR TLV	[RFC5440] 
    */
	public static final int PCEP_TLV_TYPE_NO_PATH_VECTOR=1;
	
    /**
    * 2	OVERLOAD-DURATION TLV	[RFC5440] 
    */
	public static final int PCEP_TLV_OVERLOADED_DURATION=0x02;
	
    /**
    * 3	REQ-MISSING TLV	[RFC5440] 
    */	
	public static final int PCEP_TLV_REQ_MISSING_TLV=0x03;
	
    /**
    * 4	OF-List	[RFC5541] 
    */	
	public static final int PCEP_TLV_OF_LIST_TLV=4;
	
    /**
    * 5	Order TLV	[RFC5557] 
    * TODO: NOT IMPLEMENTED
    */		
	public static final int PCEP_TLV_ORDER_TLV=5;
	
    /**
    * 6	P2MP capable	[RFC8306] 
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_P2MP_CAPABLE=6;
	
    /**
    * 7	VENDOR-INFORMATION-TLV	[RFC7470]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_VENDOR_INFORMATION_TLV=7;
	
    /**
    * 8	Wavelength Selection	[RFC8780]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_WAVELENGTH_SELECTION=8;
	
	/**
    * 9	Wavelength Restriction	[RFC8780] 
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_WAVELENGTH_RESTRICTION=9;
	
    /**
    * 10	Wavelength Allocation	[RFC8780]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_WAVELENGTH_ALLOCATION=10;
	
    /**
    * 11	Optical Interface Class List	[RFC8780]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_OPTICAL_INTERFACE_CLASS=11;
	
    /**
    * 12	Client Signal Information	[RFC8780] 
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_CLIENT_SIGNAL_INFORMATION=12;
	
    /**
    * 13	H-PCE-CAPABILITY	[RFC8685] 
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_H_PCE_CAPABILITY=13;
	
    /**
    * 14	Domain-ID	[RFC8685] 
    * TODO: CHECK
    */	
	public static final int PCEP_TLV_DOMAIN_ID_TLV=14;	
	
    /**
    * 15	H-PCE-FLAG	[RFC8685]
    * TODO: NOT IMPLEMENTED 
    */
	public static final int PCEP_TLV_H_PCE_FLAG=15;
	
    /**
     * 16	STATEFUL-PCE-CAPABILITY	[RFC8231]
     */
    public static final int PCEP_TLV_TYPE_STATEFUL_CAPABILITY=16;
    
    /**
    * 17	SYMBOLIC-PATH-NAME	[RFC8231] 
    */
    public static final int PCEP_TLV_TYPE_SYMBOLIC_PATH_NAME=17;  
    
   /**
    * 18 IPV4-LSP-IDENTIFIERS [RFC8231] 
    */
    public static final int PCEP_TLV_TYPE_IPV4_LSP_IDENTIFIERS=18;  
    
    /**
     * 19 IPV6-LSP-IDENTIFIERS [RFC8231] 
     * TODO: NOT IMPLEMENTED
     */
    public static final int PCEP_TLV_TYPE_IPV6_LSP_IDENTIFIERS=19;

    /**
     * 20	LSP-ERROR-CODE	[RFC8231]
     */
    public static final int PCEP_TLV_TYPE_LSP_ERROR_CODE=20;
    
    /**
     * 21	RSVP-ERROR-SPEC	[RFC8231] 
     */
    public static final int PCEP_TLV_TYPE_RSVP_ERROR_SPEC=21;
    
    /**
     * 23	LSP-DB-VERSION	[RFC8232] 
     */
    public static final int PCEP_TLV_TYPE_LSP_DATABASE_VERSION=23;
    
    /**
     * 24 SPEAKER-ENTITY-ID	[RFC8232] 
     */
    public static final int PCEP_TLV_TYPE_SPEAKER_ENTITY_ID=24;
    
    /**
     * 26	SR-PCE-CAPABILITY (deprecated)	[RFC8664] 
     */
    public static final int PCEP_TLV_TYPE_SR_CAPABILITY=26;  
      
    /**
     * 28	PATH-SETUP-TYPE	[RFC8408]
     * TODO: CHECK
     */		
    public static final int PCEP_TLV_PATH_SETUP=28;	
    
    /**
    * 29	Operator-configured Association Range	[RFC8697] 
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_OPERATOR_CONF_ASSOCIATION_RANGE=29;	
	
    /**
    * 30	Global Association Source	[RFC8697] 
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_GLOBAL_ASSOCIATION_SOURCE=30;	
	
    /**
    * 31	Extended Association ID	[RFC8697]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_EXTENDED_ASSOCIATION_ID=31;	
	
    /**
    * 32	P2MP-IPV4-LSP-IDENTIFIERS	[RFC8623]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_P2MP_IPV4_LSP_IDENTIFIERS=32;
	
    /**
    * 33	P2MP-IPV6-LSP-IDENTIFIERS	[RFC8623]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_P2MP_IPV6_LSP_IDENTIFIERS=33;
	
    /**
    * 34	PATH-SETUP-TYPE-CAPABILITY	[RFC8408]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_PATH_SETUP_TYPE_CAPABILITY=34;
	
    /**
    * 35	ASSOC-Type-List	[RFC8697]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_ASSOC_TYPE_LIST=35;
	
    /**
    * 36	AUTO-BANDWIDTH-CAPABILITY	[RFC8733]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_AUTO_BANDWIDTH_CAPABILITY=36;
	
    /**
    * 37	AUTO-BANDWIDTH-ATTRIBUTES	[RFC8733]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_AUTO_BANDWIDTH_ATTRIBUTES=37;
	
    /**
     * 38	Path Protection Association Group TLV	[RFC8745]
     */
	public static final int PCEP_TLV_PATH_PROT_ASSOCIATION_GROUP=39;
	
    /**
    * 39	IPV4-ADDRESS	[RFC8779, Section 2.5.2.1]
    */	
	public static final int PCEP_TLV_TYPE_IPV4_ADDRESS=39;
	
    /**
    * 40	IPV6-ADDRESS	[RFC8779, Section 2.5.2.2]
    */	
	public static final int PCEP_TLV_TYPE_IPV6_ADDRESS=40;
	
    /**
    * 41	UNNUMBERED-ENDPOINT	[RFC8779, Section 2.5.2.3]
    */	
	public static final int PCEP_TLV_TYPE_UNNUMBERED_ENDPOINT=41;
	
    /**
    * 42	LABEL-REQUEST	[RFC8779, Section 2.5.2.4]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_LABEL_REQUEST=42;
	
    /**
    * 43	LABEL-SET	[RFC8779, Section 2.5.2.5]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_AUTO_LABEL_SET=43;
	
    /**
    * 44	PROTECTION-ATTRIBUTE	[RFC8779, Section 2.8]
    * TODO: NOT IMPLEMENTED
    */	
	public static final int PCEP_TLV_PROTECTION_ATTRIBUTE=44;
	
	/**
	 * 45	GMPLS-CAPABILITY	[RFC8779, Section 2.1.2] 
	 * TODO: CHECK
	 */
	public static final int PCEP_TLV_TYPE_GMPLS_CAPABILITY=45;
	
	
	/**
	 * 46	DISJOINTNESS-CONFIGURATION	[RFC8800]
47	DISJOINTNESS-STATUS	[RFC8800]
48	POLICY-PARAMETERS-TLV (TEMPORARY - registered 2020-05-15, expires 2021-05-15)	[draft-ietf-pce-association-policy-09]
49	SCHED-LSP-ATTRIBUTE	[RFC8934]
50	SCHED-PD-LSP-ATTRIBUTE	[RFC8934]
51	PCE-FLOWSPEC-CAPABILITY TLV	[RFC-ietf-pce-pcep-flowspec-12]
52	FLOW FILTER TLV	[RFC-ietf-pce-pcep-flowspec-12]
53	L2 FLOW FILTER TLV	[RFC-ietf-pce-pcep-flowspec-12]
	 */
	
	/* **************************************************************
	 * 
	 * EXPERIMENTAL VALUES SECTION: 
	 * DO NOT USE STANDARD VALUES
	 * USE ONLY FOR EXPERIMENTS
	 * 
	 * ***************************************************************
	 */	
	
	/*
	 * Experimental Object classes. 
	 *  // NUMBERS FOR INTERNAL USE ONLY!!!!
	 */
	
	//IDEALIST
	public static final int PCEP_OBJECT_CLASS_SUGGESTED_LABEL=129;
	public static final int PCEP_OBJECT_CLASS_LABEL_SET=130;
	// PCEP Obect classes from draft-gonzalezdedios-pce-reservation-state-00
	// NUMBERS FOR INTERNAL USE ONLY!!!!
	public static final int PCEP_OBJECT_CLASS_RESERVATION=160;
	public static final int PCEP_OBJECT_CLASS_RESERVATION_CONF=161;
	//PCEP extensions for GMPLS draft-ietf-pce-gmpls-pcep-extensions-04
	// NUMBER FOR INTERNAL USE ONLY!!!!
	public static final int PCEP_OBJECT_CLASS_GENERALIZED_BANDWIDTH=155;
	//PCEP Object classes from GEYSERS!!!
	public static final int PCEP_OBJECT_CLASS_ADVANCE_RESERVATION=100;
	public static final int PCEP_OBJECT_CLASS_NET_QUOTATION=101;	

	//TODO: DEPRECATED
	public static final int PCEP_OBJECT_TYPE_ENDPOINTS_UNNUMBERED = 10;

	/*
	 * EXPERIMENTAL PCE Object types
	 */
	public static final int PCEP_OBJECT_TYPE_ENDPOINTS_MAC_NOT_UNICAST = 10;
	public static final int PCEP_OBJECT_TYPE_ENDPOINTS_MAC = 6;
	public static final int PCEP_OBJECT_TYPE_P2MP_ENDPOINTS_DATAPATHID = 15;
	/*
	 * From Strauss project
	 */
	public static final int PCEP_OBJECT_TYPE_ENDPOINTS_DATAPATH_ID = 14;

	//PCEP extensions for GMPLS draft-ietf-pce-gmpls-pcep-extensions-04
	////NUMBERS FOR INTERNAL USE ONLY!!!!
	public static final int PCEP_OBJECT_TYPE_GB_INTERSERV=2;
	public static final int PCEP_OBJECT_TYPE_GB_SONET_SDH=4;
	public static final int PCEP_OBJECT_TYPE_GB_G709=5;
	public static final int PCEP_OBJECT_TYPE_GB_ETHERNET=6;
	public static final int PCEP_OBJECT_TYPE_GB_SSON=7;
	
	// PCEP Extensions for Inter-Layer MPLS and GMPLS Traffic Engineering
    //draft-ietf-pce-inter-layer-ext-08
	public static final int PCEP_OBJECT_TYPE_INTER_LAYER=1;
	public static final int PCEP_OBJECT_TYPE_SWITCH_LAYER=1;
	public static final int PCEP_OBJECT_TYPE_REQ_ADAP_CAP=1;
	public static final int PCEP_OBJECT_TYPE_SERVER_INDICATION=1;

	// PCEP Obect classes from draft-lee-pce-wson-rwa-ext-03
	// NUMBERS FOR INTERNAL USE ONLY!!!!
	public static final int PCEP_OBJECT_TYPE_WAVELENGTH_ASSIGNEMENT=1;
	
	// PCEP Object types from GEYSERS!!!

	public static final int PCEP_OBJECT_TYPE_ADVANCE_RESERVATION = 1;
	public static final int PCEP_OBJECT_TYPE_NET_QUOTATION_ENDPOINTS_IP4 = 1;
	public static final int PCEP_OBJECT_TYPE_NET_QUOTATION_ENDPOINTS_IP6 = 2;
	public static final int PCEP_OBJECT_TYPE_NET_QUOTATION_ENDPOINTS_NSAP = 3;
	//public static final int PCEP_OBJECT_TYPE_ENDPOINTS_ASSISTEDUNICAST_IPV4 = 3;
	//public static final int PCEP_OBJECT_TYPE_ENDPOINTS_ASSISTEDUNICAST_IPV6 = 4;
	//public static final int PCEP_OBJECT_TYPE_ENDPOINTS_ASSISTEDUNICAST_NSAP = 5;
	public static final int PCEP_GENERALIZED_END_POINTS_TYPE_ASSISTED_UNICAST = 245;
	public static final int PCEP_GENERALIZED_END_POINTS_TYPE_FULL_ANYCAST = 247;

	
	//PCEP Object types from draft-ietf-pce-gmpls-pcep-extensions-02
	public static final int PCEP_OBJECT_TYPE_GENERALIZED_ENDPOINTS = 5;
	
	public static final int PCEP_OBJECT_TYPE_RESERVATION =1;
	public static final int PCEP_OBJECT_TYPE_RESERVATION_CONF=1;
	
	//IDEALIST
	public static final int PCEP_OBJECT_TYPE_SUGGESTED_LABEL=1;
	public static final int PCEP_OBJECT_TYPE_LABEL_SET_INCLUSIVE=2;
	public static final int PCEP_OBJECT_TYPE_LABEL_SET_BITMAP=1;
	
	//Values from draft-ietf-pce-gmpls-pcep-extensions-09
	public static final int PCEP_GENERALIZED_END_POINTS_TYPE_P2P=0;
	public static final int PCEP_GENERALIZED_END_POINTS_TYPE_P2MP_NEW_LEAVES=1;
	public static final int PCEP_GENERALIZED_END_POINTS_TYPE_P2MP_OLD_LEAVES_REMOVE=2;
	public static final int PCEP_GENERALIZED_END_POINTS_TYPE_P2MP_OLD_LEAVES_MODIFIED=3;
	public static final int PCEP_GENERALIZED_END_POINTS_TYPE_P2MP_OLD_LEAVES_UNCHANGED=4;
	
	public static final int PCEP_SUBOBJECT_TYPE_SR_ERO = 5; 

	public static final int PCEP_TLV_TYPE_LABEL_REQUEST=2000;
	
	public static final int PCEP_TLV_TYPE_MAX_REQ_TIME=3000;
	
	/*
	 * EXPERIMENTAL ONLY PCEP TLVS  
	 */
	
	public static final int PCEP_TLV_BANDWIDTH=502;
	public static final int PCEP_TLV_REQUEST_INFO=3070;
	public static final int PCEP_TLV_TYPE_DATAPATHID = 3049;
	public static final int PCEP_TLV_TYPE_UNNUMBERED_ENDPOINT_DATAPATHID = 3050;
	public static final int PCEP_TLV_TYPE_XIFI=500;
	// TLV types from GEYSERS!!!
	public static final int PCEP_TLV_TYPE_ENDPOINT_IPV4=33033;
	public static final int PCEP_TLV_TYPE_ENDPOINTS_IPV4=33035;
	public static final int PCEP_TLV_TYPE_ENDPOINTS_IPV6=33034;
	public static final int PCEP_TLV_TYPE_ENDPOINTS_NSAP=999;
	public static final int PCEP_TLV_TYPE_ENDPOINTS_STORAGE=1000;
	public static final int PCEP_TLV_TYPE_ENDPOINTS_SERVER=1001;
	public static final int PCEP_TLV_TYPE_ENDPOINTS_APPLICATION=1002;
	public static final int PCEP_TLV_TYPE_REQUESTED_STORAGE_SIZE=1003;
	public static final int PCEP_TLV_TYPE_REQUESTED_VOLUME_SIZE=1004;
	public static final int PCEP_TLV_TYPE_REQUESTED_CPUs=1005;
	public static final int PCEP_TLV_TYPE_REQUESTED_MEMORY=1006;
	public static final int PCEP_TLV_TYPE_REQUESTED_DISK_SPACE=1007;
	public static final int PCEP_TLV_TYPE_OPERATIVE_SYSTEM=1008;
	public static final int PCEP_TLV_TYPE_APPLICATION=1009;	
	public static final int PCEP_TLV_TYPE_IT_ADV=1010;
	public static final int PCEP_TLV_TYPE_STORAGE=1011;
	public static final int PCEP_TLV_TYPE_SERVER=1012;
	// draft-gonzalezdedios-pce-reservation-state
	public static final int PCEP_TLV_TYPE_RESERVATION_ID=20000;
	//TLV STRONGEST: collaborative PCEs
	public static final int PCEP_TLV_TYPE_PATH_RESERVATION=30003;
	// FOR STRONGEST USE ONLY!!!!!
	public static final int PCEP_TLV_REACHABILITY_TLV=32777;
	//FOR STRONGEST USE ONLY!!!!!
	public static final int PCEP_TLV_OSPFTE_LSU_TLV=32778;
	//FOR STRONGEST USE ONLY!!!!!
	public static final int PCEP_TLV_OSPFTE_LSA_TLV=32779;
	//FOR STRONGEST USE ONLY!!!!!
	public static final int PCEP_TLV_PCE_ID_TLV=32769;
	
	/*
	 * Notification types
	 */
	public static final int PCEP_NOTIFICATION_TYPE_PENDING_REQUEST_CANCELLED=0x01;
	public static final int PCEP_NOTIFICATION_TYPE_OVERLOADED_PCE=0x02;
	
	//From STRONGEST
	public static final int PCEP_NOTIFICATION_TYPE_REACHABILITY=100;
	public static final int  PCEP_NOTIFICATION_TYPE_TOPOLOGY=101;
	public static final int  PCEP_NOTIFICATION_TYPE_IT_RESOURCE_INFORMATION=0x04;

	//For PRIVATE USE ONLY: draft-gonzalezdedios-pce-reservation-state-00
	public static final int PCEP_NOTIFICATION_TYPE_CANCEL_RESERVATION=120;
	
	//STRONGEST:collaborative PCEs --- PRIVATE USE ONLY
	public static final int PCEP_NOTIFICATION_TYPE_PRERESERVE=121;
	
	/*
	 * Notification values
	 */
	//From GEYSERS
	public static final int  PCEP_NOTIFICATION_VALUE_QUERY=0x00;
	public static final int  PCEP_NOTIFICATION_VALUE_UPDATE=0x01;
	public static final int  PCEP_NOTIFICATION_VALUE_DELETE=0x02;
	
	//For PRIVATE USE ONLY: draft-gonzalezdedios-pce-reservation-state-00
	public static final int  PCEP_NOTIFICATION_VALUE_CANCEL_RESERVATION=1;
	public static final int  PCEP_NOTIFICATION_VALUE_CANCEL_ALL_RESERVATIONS=2;
	
	//Strongest
	public static final int  PCEP_NOTIFICATION_VALUE_PATH_RESERVATION=1;
	//Metric Types
	//Standard Metric Types (RFC 5440)
	//T=1: IGP metric
    public static final int  PCEP_METRIC_TYPE_IGP_METRIC=1;
    //  T=2: TE metric
    public static final int  PCEP_METRIC_TYPE_TE_METRIC=2;
    //  T=3: Hop Counts
    public static final int  PCEP_METRIC_TYPE_HOP_COUNT=3;
    //  T=3: BW    
    public static final int  PCEP_METRIC_TYPE_BW=4;
    
    //From draft-dhody-pce-pcep-service-aware-02
    //  T=13(IANA): Latency metric
    public static final int  PCEP_METRIC_TYPE_LATENCY_METRIC=13;
    
    // Nuevos Emuladr PCEP Session Create LSP
    /*private static final int PCEP_OBJECT_CLASS*/
   
    //Inventados RSVP
    public static final int  RSVP_OBJECT_CLASS_ENDPOINTS=222;
    public static final int  RSVP_OBJECT_TYPE_ENDPOINTS_IPV4=223;
    
    
    
    /*******************************************************************/
    

    

    
    //Redundancy group identifier TLV type
    public static final int PCEP_TLV_TYPE_PCE_REDUNDANCY_GROUP_INDENTIFIER=5557;
    

    

    
    //Tunnel ID TLV
    public static final int PCEP_TLV_TYPE_TUNNEL_ID=5561;
        

    
   
    
    public static final byte[] redundancyID= new byte[]{1,2,3,4}; 
    
    /*******************************************************************/
    
    public static final int LSP_OPERATIONAL_DOWN = 0;
    public static final int LSP_OPERATIONAL_UP = 1;
    public static final int LSP_OPERATIONAL_ACTIVE = 2;
    public static final int LSP_OPERATIONAL_GOING_DOWN = 3;
    public static final int LSP_OPERATIONAL_GOING_UP = 4;
    
    //From draft-ietf-pce-gmpls-pcep-extensions-09
    public static final int PCEP_GMPLS_GEN_BANDWIDTH_INTSERV = 2;
    public static final int PCEP_GMPLS_GEN_BANDWIDTH_SONET_SDH = 4;
    public static final int PCEP_GMPLS_GEN_BANDWIDTH_G709 = 5;
    public static final int PCEP_GMPLS_GEN_BANDWIDTH_ETHERNET = 6;
    // From draft-ietf-ccamp-flexible-grid-rsvp-te-ext-00
    public static final int PCEP_GMPLS_GEN_BANDWIDTH_SSON = 10;
    
}