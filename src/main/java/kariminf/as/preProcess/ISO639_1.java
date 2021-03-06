package kariminf.as.preProcess;

public enum ISO639_1 {

	AB("Abkhaz"),
	AA("Afar"),
	AF("Afrikaans"),
	AK("Akan"),
	SQ("Albanian"),
	AM("Amharic"),
	AR("Arabic"),
	AN("Aragonese"),
	HY("Armenian"),
	AS("Assamese"),
	AV("Avaric"),
	AE("Avestan"),
	AY("Aymara"),
	AZ("Azerbaijani"),
	BM("Bambara"),
	BA("Bashkir"),
	EU("Basque"),
	BE("Belarusian"),
	BN("Bengali, Bangla"),
	BH("Bihari"),
	BI("Bislama"),
	BS("Bosnian"),
	BR("Breton"),
	BG("Bulgarian"),
	MY("Burmese"),
	CA("Catalan"),
	CH("Chamorro"),
	CE("Chechen"),
	NY("Chichewa, Chewa, Nyanja"),
	ZH("Chinese"),
	CV("Chuvash"),
	KW("Cornish"),
	CO("Corsican"),
	CR("Cree"),
	HR("Croatian"),
	CS("Czech"),
	DA("Danish"),
	DV("Divehi, Dhivehi, Maldivian"),
	NL("Dutch"),
	DZ("Dzongkha"),
	EN("English"),
	EO("Esperanto"),
	ET("Estonian"),
	EE("Ewe"),
	FO("Faroese"),
	FJ("Fijian"),
	FI("Finnish"),
	FR("French"),
	FF("Fula, Fulah, Pulaar, Pular"),
	GL("Galician"),
	KA("Georgian"),
	DE("German"),
	EL("Greek (modern)"),
	GN("Guaraní"),
	GU("Gujarati"),
	HT("Haitian, Haitian Creole"),
	HA("Hausa"),
	HE("Hebrew (modern)"),
	HZ("Herero"),
	HI("Hindi"),
	HO("Hiri Motu"),
	HU("Hungarian"),
	IA("Interlingua"),
	ID("Indonesian"),
	IE("Interlingue"),
	GA("Irish"),
	IG("Igbo"),
	IK("Inupiaq"),
	IO("Ido"),
	IS("Icelandic"),
	IT("Italian"),
	IU("Inuktitut"),
	JA("Japanese"),
	JV("Javanese"),
	KL("Kalaallisut, Greenlandic"),
	KN("Kannada"),
	KR("Kanuri"),
	KS("Kashmiri"),
	KK("Kazakh"),
	KM("Khmer"),
	KI("Kikuyu, Gikuyu"),
	RW("Kinyarwanda"),
	KY("Kyrgyz"),
	KV("Komi"),
	KG("Kongo"),
	KO("Korean"),
	KU("Kurdish"),
	KJ("Kwanyama, Kuanyama"),
	LA("Latin"),
	LB("Luxembourgish, Letzeburgesch"),
	LG("Ganda"),
	LI("Limburgish, Limburgan, Limburger"),
	LN("Lingala"),
	LO("Lao"),
	LT("Lithuanian"),
	LU("Luba-Katanga"),
	LV("Latvian"),
	GV("Manx"),
	MK("Macedonian"),
	MG("Malagasy"),
	MS("Malay"),
	ML("Malayalam"),
	MT("Maltese"),
	MI("Māori"),
	MR("Marathi (Marāṭhī)"),
	MH("Marshallese"),
	MN("Mongolian"),
	NA("Nauruan"),
	NV("Navajo, Navaho"),
	ND("Northern Ndebele"),
	NE("Nepali"),
	NG("Ndonga"),
	NB("Norwegian Bokmål"),
	NN("Norwegian Nynorsk"),
	NO("Norwegian"),
	II("Nuosu"),
	NR("Southern Ndebele"),
	OC("Occitan"),
	OJ("Ojibwe, Ojibwa"),
	CU("Old Church Slavonic, Church Slavonic, Old Bulgarian"),
	OM("Oromo"),
	OR("Oriya"),
	OS("Ossetian, Ossetic"),
	PA("Panjabi, Punjabi"),
	PI("Pāli"),
	FA("Persian (Farsi)"),
	PL("Polish"),
	PS("Pashto, Pushto"),
	PT("Portuguese"),
	QU("Quechua"),
	RM("Romansh"),
	RN("Kirundi"),
	RO("Romanian"),
	RU("Russian"),
	SA("Sanskrit (Saṁskṛta)"),
	SC("Sardinian"),
	SD("Sindhi"),
	SE("Northern Sami"),
	SM("Samoan"),
	SG("Sango"),
	SR("Serbian"),
	GD("Scottish Gaelic, Gaelic"),
	SN("Shona"),
	SI("Sinhala, Sinhalese"),
	SK("Slovak"),
	SL("Slovene"),
	SO("Somali"),
	ST("Southern Sotho"),
	ES("Spanish"),
	SU("Sundanese"),
	SW("Swahili"),
	SS("Swati"),
	SV("Swedish"),
	TA("Tamil"),
	TE("Telugu"),
	TG("Tajik"),
	TH("Thai"),
	TI("Tigrinya"),
	BO("Tibetan Standard, Tibetan, Central"),
	TK("Turkmen"),
	TL("Tagalog"),
	TN("Tswana"),
	TO("Tonga (Tonga Islands)"),
	TR("Turkish"),
	TS("Tsonga"),
	TT("Tatar"),
	TW("Twi"),
	TY("Tahitian"),
	UG("Uyghur"),
	UK("Ukrainian"),
	UR("Urdu"),
	UZ("Uzbek"),
	VE("Venda"),
	VI("Vietnamese"),
	VO("Volapük"),
	WA("Walloon"),
	CY("Welsh"),
	WO("Wolof"),
	FY("Western Frisian"),
	XH("Xhosa"),
	YI("Yiddish"),
	YO("Yoruba"),
	ZA("Zhuang, Chuang"),
	ZU("Zulu");
	
	
	private String name;
	
	private ISO639_1(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
}
