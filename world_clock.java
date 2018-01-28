import java.util.Scanner;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
 class TimeConverter
    {
	     int i,ch,n,ab;
		 long a1=0,a2=0;
		  Scanner c1=new Scanner(System.in);
	     void countries()
		      {
			     System.out.println("//////........................////////***********COUNTRIES OF ASIA***********////////..........................//////");
				 System.out.println("1.Afghanistan   2.Armenia   3.Azerbaijan   4.Bahrain   5.Bangladesh   6.Bhutan   7.Brunei      8.Cambodiya   9.China        10.Cyprus");
				 System.out.println("11.Georgia     12.India     13.Indonesia   14.Iran     15.Iraq        16.Israel   17.Japan     18.Jordan     19.kazakhstan  20.Kuwait");
				 System.out.println("21.Kyrgzstan   22.Laos      23.Lebanon     24.Malaysia 25.Maldives    26.Mongolia 27.Myanmar   28.Nepal      29.North Korea 30.Oman");
				 System.out.println("31.Pakistan    32.Palestine 33.Philippines 34.Qatar    35.Rusia       36.Saudi    37.Singapore 38.South Korea 39.Sri Lanka  40.Syria");
				 System.out.println("41.Taiwan      42.Tajikistan 43.Thailand   44.Tmor Laste 45.Turkey    46.Turkmenistan 47.UAE   48.Uzbekistan  49.Vietname   50.Yemen");
			  }
		 void converter()
	          {
				   i=0;
				   while(i!=5)
				      {
						   System.out.println("Enter the value of i...5.for exit");
				           i=c1.nextInt();
						   if(i!=5)
						      {
							      System.out.println("Enter the choice of Country from list");
                                  ch=c1.nextInt();
                                  switch(ch)
                                        {
											 case 1:	 
                                                    ZoneId z1=ZoneId.of("Asia/Kabul");
													LocalDateTime t1=LocalDateTime.now(z1);
													DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt1=t1.format(f1);
													OffsetDateTime o1 = OffsetDateTime.now(z1);  
                                                    System.out.println("The day of Afghanistan="+o1.getDayOfWeek());
                                                    System.out.println("The date and time of Afghanistan  "+fdt1);
                                                    break;
											 case 2:	 
                                                    ZoneId z2=ZoneId.of("Asia/Yerevan");
													LocalDateTime t2=LocalDateTime.now(z2);
													DateTimeFormatter f2=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt2=t2.format(f2);
													OffsetDateTime o2 = OffsetDateTime.now(z2);  
                                                    System.out.println("The day of Armenia="+o2.getDayOfWeek());
                                                    System.out.println("The date and time of Armenia "+fdt2);
                                                    break;	
											 case 3:	 
                                                    ZoneId z3=ZoneId.of("Asia/Baku");
													LocalDateTime t3=LocalDateTime.now(z3);
													DateTimeFormatter f3=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt3=t3.format(f3);
													OffsetDateTime o3 = OffsetDateTime.now(z3);  
                                                    System.out.println("The day of Azerbaijan="+o3.getDayOfWeek());
                                                    System.out.println("The date and time of Azerbaijan  "+fdt3);
                                                    break;		
											  
                                              case 4:	 
                                                    ZoneId z4=ZoneId.of("Asia/Bahrain");
													LocalDateTime t4=LocalDateTime.now(z4);
													DateTimeFormatter f4=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt4=t4.format(f4);
													 OffsetDateTime o4 = OffsetDateTime.now(z4);  
                                                   System.out.println("The day of Bahrain="+o4.getDayOfWeek());
                                                    System.out.println("The date and time of Bahrain  "+fdt4);
                                                    break;
                                              case 5:	 
                                                    ZoneId z5=ZoneId.of("Asia/Dhaka");
													LocalDateTime t5=LocalDateTime.now(z5);
													DateTimeFormatter f5=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt5=t5.format(f5);
													OffsetDateTime o5 = OffsetDateTime.now(z5);  
                                                    System.out.println("The day of Bangladesh="+o5.getDayOfWeek());
                                                    System.out.println("The date and time of Bangladesh  "+fdt5);
                                                    break;
                                              case 6:	 
                                                    ZoneId z6=ZoneId.of("Asia/Thimbu");
													LocalDateTime t6=LocalDateTime.now(z6);
													DateTimeFormatter f6=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt6=t6.format(f6);
													 OffsetDateTime o6 = OffsetDateTime.now(z6);  
                                                   System.out.println("The day of Bhutan="+o6.getDayOfWeek());
                                                    System.out.println("The date and time of Bhutan  "+fdt6);
                                                    break;	
                                              case 7:	 
                                                    ZoneId z7=ZoneId.of("Asia/Brunei");
													LocalDateTime t7=LocalDateTime.now(z7);
													DateTimeFormatter f7=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt7=t7.format(f7);
													 OffsetDateTime o7 = OffsetDateTime.now(z7);  
                                                   System.out.println("The day of Brunei="+o7.getDayOfWeek());
                                                    System.out.println("The date and time of Brunei  "+fdt7);
                                                    break;
                                              case 8:	 
                                                    ZoneId z8=ZoneId.of("Asia/Phnom_Penh");
													LocalDateTime t8=LocalDateTime.now(z8);
													DateTimeFormatter f8=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt8=t8.format(f8);
													 OffsetDateTime o8 = OffsetDateTime.now(z8);  
                                                   System.out.println("The day of Cambodia="+o8.getDayOfWeek());
                                                    System.out.println("The date and time of Cambodia  "+fdt8);
                                                    break;
                                             case 9:	 
                                                    ZoneId z9=ZoneId.of("Asia/Shanghai");
													LocalDateTime t9=LocalDateTime.now(z9);
													DateTimeFormatter f9=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt9=t9.format(f9);
													 OffsetDateTime o9 = OffsetDateTime.now(z9);  
                                                   System.out.println("The day of China="+o9.getDayOfWeek());
                                                    System.out.println("The date and time of China  "+fdt9);
                                                    break;
                                             case 10:	 
                                                    ZoneId z10=ZoneId.of("Asia/Nicosia");
													LocalDateTime t10=LocalDateTime.now(z10);
													DateTimeFormatter f10=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt10=t10.format(f10);
													 OffsetDateTime o10 = OffsetDateTime.now(z10);  
                                                   System.out.println("The day of Cyprus="+o10.getDayOfWeek());
                                                    System.out.println("The date and time of Cyprus  "+fdt10);
                                                    break;	
                                             case 11:	 
                                                    ZoneId z11=ZoneId.of("Asia/Tbilisi");
													LocalDateTime t11=LocalDateTime.now(z11);
													DateTimeFormatter f11=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt11=t11.format(f11);
													 OffsetDateTime o11 = OffsetDateTime.now(z11);  
                                                   System.out.println("The day of Georgia="+o11.getDayOfWeek());
                                                    System.out.println("The date and time of Georgia  "+fdt11);
                                                    break;
											 case 12:
											       LocalDateTime t12=LocalDateTime.now();
												   DateTimeFormatter f12=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String formatDateTime=t12.format(f12);
												    OffsetDateTime offsetDT = OffsetDateTime.now();  
                                                   System.out.println("The day of India="+offsetDT.getDayOfWeek());
												   System.out.println("the date and time of INDIA..."+formatDateTime);
												   break;		
                                             case 13:	 
                                                    ZoneId z13=ZoneId.of("Asia/Makassar");
													LocalDateTime t13=LocalDateTime.now(z13);
													DateTimeFormatter f13=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt13=t13.format(f13);
													 OffsetDateTime o13 = OffsetDateTime.now(z13);  
                                                   System.out.println("The day of Indonesia="+o13.getDayOfWeek());
                                                    System.out.println("The date and time of Indonesia  "+fdt13);
                                                    break;
                                              case 14:	 
                                                    ZoneId z14=ZoneId.of("Asia/Tehran");
													LocalDateTime t14=LocalDateTime.now(z14);
													DateTimeFormatter f14=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt14=t14.format(f14);
													 OffsetDateTime o14 = OffsetDateTime.now(z14);  
                                                   System.out.println("The day of Iran="+o14.getDayOfWeek());
                                                    System.out.println("The date and time of Iran  "+fdt14);
                                                    break;
											  case 15:	 
                                                    ZoneId z15=ZoneId.of("Asia/Baghdad");
													LocalDateTime t15=LocalDateTime.now(z15);
													DateTimeFormatter f15=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt15=t15.format(f15);
													 OffsetDateTime o15 = OffsetDateTime.now(z15);  
                                                   System.out.println("The day of Iraq="+o15.getDayOfWeek());
                                                    System.out.println("The date and time of Iraq  "+fdt15);
                                                    break;
	                                         case 16:	 
                                                    ZoneId z16=ZoneId.of("Asia/Jerusalem");
													LocalDateTime t16=LocalDateTime.now(z16);
													DateTimeFormatter f16=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt16=t16.format(f16);
													 OffsetDateTime o16 = OffsetDateTime.now(z16);  
                                                   System.out.println("The day of Israel="+o16.getDayOfWeek());
                                                    System.out.println("The date and time of Israel  "+fdt16);
                                                    break;
	                                          case 17:	 
                                                    ZoneId z17=ZoneId.of("Asia/Tokyo");
													LocalDateTime t17=LocalDateTime.now(z17);
													DateTimeFormatter f17=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt17=t17.format(f17);
													 OffsetDateTime o17 = OffsetDateTime.now(z17);  
                                                   System.out.println("The day of Japan="+o17.getDayOfWeek());
                                                    System.out.println("The date and time of Japan  "+fdt17);
                                                    break;
                                              case 18:	 
                                                    ZoneId z18=ZoneId.of("Asia/Amman");
													LocalDateTime t18=LocalDateTime.now(z18);
													DateTimeFormatter f18=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt18=t18.format(f18);
													 OffsetDateTime o18 = OffsetDateTime.now(z18);  
                                                   System.out.println("The day of Jordan="+o18.getDayOfWeek());
                                                    System.out.println("The date and time of Jordhan  "+fdt18);
                                                    break;
                                              case 19:	 
                                                    ZoneId z19=ZoneId.of("Asia/Almaty");
													LocalDateTime t19=LocalDateTime.now(z19);
													DateTimeFormatter f19=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt19=t19.format(f19);
													 OffsetDateTime o19 = OffsetDateTime.now(z19);  
                                                   System.out.println("The day of Kazakhstan="+o19.getDayOfWeek());
                                                    System.out.println("The date and time of Kazakhstan  "+fdt19);
                                                    break;
                                              case 20:	 
                                                    ZoneId z20=ZoneId.of("Asia/Kuwait");
													LocalDateTime t20=LocalDateTime.now(z20);
													DateTimeFormatter f20=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt20=t20.format(f20);
													 OffsetDateTime o20 = OffsetDateTime.now(z20);  
                                                   System.out.println("The day of Kuwait="+o20.getDayOfWeek());
                                                    System.out.println("The date and time of kuwait  "+fdt20);
                                                    break;
                                              case 21:	 
                                                    ZoneId z21=ZoneId.of("Asia/Bishkek");
													LocalDateTime t21=LocalDateTime.now(z21);
													DateTimeFormatter f21=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt21=t21.format(f21);
													 OffsetDateTime o21 = OffsetDateTime.now(z21);  
                                                   System.out.println("The day of Kyrgzstan="+o21.getDayOfWeek());
                                                    System.out.println("The date and time of Kyrgzstan  "+fdt21);
                                                    break;
                                              case 22:	 
                                                    ZoneId z22=ZoneId.of("Asia/Veintiane");
													LocalDateTime t22=LocalDateTime.now(z22);
													DateTimeFormatter f22=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt22=t22.format(f22);
													 OffsetDateTime o22 = OffsetDateTime.now(z22);  
                                                   System.out.println("The day of Laos="+o22.getDayOfWeek());
                                                    System.out.println("The date and time of Laos  "+fdt22);
                                                    break;
                                              case 23:	 
                                                    ZoneId z23=ZoneId.of("Asia/Beirut");
													LocalDateTime t23=LocalDateTime.now(z23);
													DateTimeFormatter f23=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt23=t23.format(f23);
													 OffsetDateTime o23 = OffsetDateTime.now(z23);  
                                                   System.out.println("The day of Lebanon="+o23.getDayOfWeek());
                                                    System.out.println("The date and time of Lebanon  "+fdt23);
                                                    break;
                                              case 24:	 
                                                    ZoneId z24=ZoneId.of("Asia/Kuala_Lumpur");
													LocalDateTime t24=LocalDateTime.now(z24);
													DateTimeFormatter f24=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt24=t24.format(f24);
													 OffsetDateTime o24 = OffsetDateTime.now(z24);  
                                                   System.out.println("The day of Malaysia="+o24.getDayOfWeek());
                                                    System.out.println("The date and time of Malaysia  "+fdt24);
                                                    break;
                                             case 25:	 
                                                    ZoneId z25=ZoneId.of("Indian/Maldives");
													LocalDateTime t25=LocalDateTime.now(z25);
													DateTimeFormatter f25=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt25=t25.format(f25);
													 OffsetDateTime o25 = OffsetDateTime.now(z25);  
                                                   System.out.println("The day of Meddives="+o25.getDayOfWeek());
                                                    System.out.println("The date and time of Meddives  "+fdt25);
                                                    break;			
                                             case 26:	 
                                                    ZoneId z26=ZoneId.of("Asia/Ulan_Bator");
													LocalDateTime t26=LocalDateTime.now(z26);
													DateTimeFormatter f26=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt26=t26.format(f26);
													 OffsetDateTime o26 = OffsetDateTime.now(z26);  
                                                   System.out.println("The day of Mongolia="+o26.getDayOfWeek());
                                                    System.out.println("The date and time of Mongolia  "+fdt26);
                                                    break;
                                             case 27:	 
                                                    ZoneId z27=ZoneId.of("Asia/Rangoon");
													LocalDateTime t27=LocalDateTime.now(z27);
													DateTimeFormatter f27=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt27=t27.format(f27);
													 OffsetDateTime o27 = OffsetDateTime.now(z27);  
                                                   System.out.println("The day of Myanmar="+o27.getDayOfWeek());
                                                    System.out.println("The date and time of Myanmar  "+fdt27);
                                                    break;
                                             case 28:	 
                                                    ZoneId z28=ZoneId.of("Asia/Kathmandu");
													LocalDateTime t28=LocalDateTime.now(z28);
													DateTimeFormatter f28=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt28=t28.format(f28);
													 OffsetDateTime o28 = OffsetDateTime.now(z28);  
                                                   System.out.println("The day of Nepal="+o28.getDayOfWeek());
                                                    System.out.println("The date and time of Nepal  "+fdt28);
                                                    break;								
                                             case 29:	 
                                                    ZoneId z29=ZoneId.of("Asia/Pyongyang");
													LocalDateTime t29=LocalDateTime.now(z29);
													DateTimeFormatter f29=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt29=t29.format(f29);
													 OffsetDateTime o29 = OffsetDateTime.now(z29);  
                                                   System.out.println("The day of North Korea="+o29.getDayOfWeek());
                                                    System.out.println("The date and time of North Korea  "+fdt29);
                                                    break;
                                             case 30:	 
                                                    ZoneId z30=ZoneId.of("Asia/Muscat");
													LocalDateTime t30=LocalDateTime.now(z30);
													DateTimeFormatter f30=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt30=t30.format(f30);
													 OffsetDateTime o30 = OffsetDateTime.now(z30);  
                                                   System.out.println("The day of Omen="+o30.getDayOfWeek());
                                                    System.out.println("The date and time of Omen  "+fdt30);
                                                    break;											
                                             case 31:	 
                                                    ZoneId z31=ZoneId.of("Asia/Karachi");
													LocalDateTime t31=LocalDateTime.now(z31);
													DateTimeFormatter f31=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt31=t31.format(f31);
													 OffsetDateTime o31 = OffsetDateTime.now(z31);  
                                                   System.out.println("The day of Pakistan="+o31.getDayOfWeek());
                                                    System.out.println("The date and time of Pakistan  "+fdt31);
                                                    break;									
                                             case 32:	 
                                                    ZoneId z32=ZoneId.of("Asia/Gaza");
													LocalDateTime t32=LocalDateTime.now(z32);
													DateTimeFormatter f32=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt32=t32.format(f32);
													 OffsetDateTime o32 = OffsetDateTime.now(z32);  
                                                   System.out.println("The day of Palestine="+o32.getDayOfWeek());
                                                    System.out.println("The date and time of Palestine  "+fdt32);
                                                    break;									
                                             case 33:	 
                                                    ZoneId z33=ZoneId.of("Asia/Manila");
													LocalDateTime t33=LocalDateTime.now(z33);
													DateTimeFormatter f33=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt33=t33.format(f33);
													 OffsetDateTime o33 = OffsetDateTime.now(z33);  
                                                   System.out.println("The day of Philippines="+o33.getDayOfWeek());
                                                    System.out.println("The date and time of Philippines  "+fdt33);
                                                    break;									
                                             case 34:	 
                                                    ZoneId z34=ZoneId.of("Asia/Qatar");
													LocalDateTime t34=LocalDateTime.now(z34);
													DateTimeFormatter f34=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt34=t34.format(f34);
													 OffsetDateTime o34 = OffsetDateTime.now(z34);  
                                                   System.out.println("The day of Qatar="+o34.getDayOfWeek());
                                                    System.out.println("The date and time of Qatar  "+fdt34);
                                                    break;								
                                             case 35:	 
                                                    ZoneId z35=ZoneId.of("Asia/Magadan");
													LocalDateTime t35=LocalDateTime.now(z35);
													DateTimeFormatter f35=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt35=t35.format(f35);
													 OffsetDateTime o35 = OffsetDateTime.now(z35);  
                                                   System.out.println("The day of Russia="+o35.getDayOfWeek());
                                                    System.out.println("The date and time of Russia  "+fdt35);
                                                    break;								
                                             case 36:	 
                                                    ZoneId z36=ZoneId.of("Asia/Riyadh");
													LocalDateTime t36=LocalDateTime.now(z36);
													DateTimeFormatter f36=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt36=t36.format(f36);
													 OffsetDateTime o36 = OffsetDateTime.now(z36);  
                                                   System.out.println("The day of Saudi Arabia="+o36.getDayOfWeek());
                                                    System.out.println("The date and time of Saudi Arabia  "+fdt36);
                                                    break;										
                                     		  case 37:	 
                                                    ZoneId z37=ZoneId.of("Asia/Singapore");
													LocalDateTime t37=LocalDateTime.now(z37);
													DateTimeFormatter f37=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt37=t37.format(f37);
													 OffsetDateTime o37 = OffsetDateTime.now(z37);  
                                                   System.out.println("The day of  Singapore="+o37.getDayOfWeek());
                                                    System.out.println("The date and time of Singapore  "+fdt37);
                                                    break;										
                                             case 38:	 
                                                    ZoneId z38=ZoneId.of("Asia/Seoul");
													LocalDateTime t38=LocalDateTime.now(z38);
													DateTimeFormatter f38=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt38=t38.format(f38);
													 OffsetDateTime o38 = OffsetDateTime.now(z38);  
                                                   System.out.println("The day of  South Korea="+o38.getDayOfWeek());
                                                    System.out.println("The date and time of South Korea  "+fdt38);
                                                    break;
                                             case 39:	 
                                                    ZoneId z39=ZoneId.of("Asia/Colombo");
													LocalDateTime t39=LocalDateTime.now(z39);
													DateTimeFormatter f39=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt39=t39.format(f39);
													 OffsetDateTime o39 = OffsetDateTime.now(z39);  
                                                   System.out.println("The day of  Sri Lanka="+o39.getDayOfWeek());
                                                    System.out.println("The date and time of Sri Lanka  "+fdt39);
                                                    break;											
                                             case 40:	 
                                                    ZoneId z40=ZoneId.of("Asia/Damascus");
													LocalDateTime t40=LocalDateTime.now(z40);
													DateTimeFormatter f40=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt40=t40.format(f40);
													 OffsetDateTime o40 = OffsetDateTime.now(z40);  
                                                   System.out.println("The day of  Syria="+o40.getDayOfWeek());
                                                    System.out.println("The date and time of Syria  "+fdt40);
                                                    break;									
                                             case 41:	 
                                                    ZoneId z41=ZoneId.of("Asia/Taipei");
													LocalDateTime t41=LocalDateTime.now(z41);
													DateTimeFormatter f41=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt41=t41.format(f41);
													 OffsetDateTime o41 = OffsetDateTime.now(z41);  
                                                   System.out.println("The day of  Taiwan="+o41.getDayOfWeek());
                                                    System.out.println("The date and time of Taiwan  "+fdt41);
                                                    break;										
                                             case 42:	 
                                                    ZoneId z42=ZoneId.of("Asia/Dushanbe");
													LocalDateTime t42=LocalDateTime.now(z42);
													DateTimeFormatter f42=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt42=t42.format(f42);
													 OffsetDateTime o42 = OffsetDateTime.now(z42);  
                                                   System.out.println("The day of  Tajikistan="+o42.getDayOfWeek());
                                                    System.out.println("The date and time of Tajikistan  "+fdt42);
                                                    break;
											 case 43:	 
                                                    ZoneId z43=ZoneId.of("Asia/Bangkok");
													LocalDateTime t43=LocalDateTime.now(z43);
													DateTimeFormatter f43=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt43=t43.format(f43);
													 OffsetDateTime o43 = OffsetDateTime.now(z43);  
                                                   System.out.println("The day of  Thailand="+o43.getDayOfWeek());
                                                    System.out.println("The date and time of Thailand  "+fdt43);
                                                    break;		
											 case 44:	 
                                                    ZoneId z44=ZoneId.of("Asia/Dili");
													LocalDateTime t44=LocalDateTime.now(z44);
													DateTimeFormatter f44=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt44=t44.format(f44);
													 OffsetDateTime o44 = OffsetDateTime.now(z44);  
                                                   System.out.println("The day of  Timor_Leste="+o44.getDayOfWeek());
                                                    System.out.println("The date and time of Timor_Leste  "+fdt44);
                                                    break;		
											 case 45:	 
                                                    ZoneId z45=ZoneId.of("Asia/Istanbul");
													LocalDateTime t45=LocalDateTime.now(z45);
													DateTimeFormatter f45=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt45=t45.format(f45);
													 OffsetDateTime o45 = OffsetDateTime.now(z45);  
                                                   System.out.println("The day of  Turkey="+o45.getDayOfWeek());
                                                    System.out.println("The date and time of Turkey  "+fdt45);
                                                    break;		
											 case 46:	 
                                                    ZoneId z46=ZoneId.of("Asia/Ashgabat");
													LocalDateTime t46=LocalDateTime.now(z46);
													DateTimeFormatter f46=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt46=t46.format(f46);
													 OffsetDateTime o46 = OffsetDateTime.now(z46);  
                                                   System.out.println("The day of  Turkmenistan="+o46.getDayOfWeek());
                                                    System.out.println("The date and time of Turkmenistan  "+fdt46);
                                                    break;		
                                             case 47:	 
                                                    ZoneId z47=ZoneId.of("Asia/Dubai");
													LocalDateTime t47=LocalDateTime.now(z47);
													DateTimeFormatter f47=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt47=t47.format(f47);
													 OffsetDateTime o47 = OffsetDateTime.now(z47);  
                                                   System.out.println("The day of  United Arab Emirates="+o47.getDayOfWeek());
                                                    System.out.println("The date and time of United Arab Emirates  "+fdt47);
                                                    break;
                                             case 48:	 
                                                    ZoneId z48=ZoneId.of("Asia/Tashkent");
													LocalDateTime t48=LocalDateTime.now(z48);
													DateTimeFormatter f48=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt48=t48.format(f48);
													 OffsetDateTime o48 = OffsetDateTime.now(z48);  
                                                   System.out.println("The day of  Uzbekistan="+o48.getDayOfWeek());
                                                    System.out.println("The date and time of Uzbekistan "+fdt48);
                                                    break;													
										     case 49:	 
                                                    ZoneId z49=ZoneId.of("Asia/Ho_Chi_Minh");
													LocalDateTime t49=LocalDateTime.now(z49);
													DateTimeFormatter f49=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt49=t49.format(f49);
													 OffsetDateTime o49 = OffsetDateTime.now(z49);  
                                                   System.out.println("The day of   Vietnam="+o49.getDayOfWeek());
                                                    System.out.println("The date and time of Vietnam  "+fdt49);
                                                    break;			
										     case 50:	 
                                                    ZoneId z50=ZoneId.of("Asia/Aden");
													LocalDateTime t50=LocalDateTime.now(z50);
													DateTimeFormatter f50=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt50=t50.format(f50);
													 OffsetDateTime o50 = OffsetDateTime.now(z50);  
                                                   System.out.println("The day of  Yemen="+o50.getDayOfWeek());
                                                    System.out.println("The date and time of Yemen  "+fdt50);
                                                    break;		   														   
											 default:
                                                  System.out.println("..NO THANKS..");
                                                   break;												  
										}				
                                      continue;										
							  }
							  break;
					  }
			  }				  
	
	}
class TimeConverter1 extends TimeConverter
    {
	     int j,chh,n;
		  Scanner c2=new Scanner(System.in);
	     void countries1()
		      {
			     System.out.println("//////........................////////***********COUNTRIES OF EUROPE***********////////..........................//////");
				 System.out.println("51.Albania     52.Andorra         53.Gibraltar      54.Austria     55.Ukrania      56.Belarus       57.Belgium       58.Bosina and Herzegovina 59.Bulgaria     60.Croatia");
				 System.out.println("61.Cyprus      62.Czech Republic  63.Denmark        64.Estonia     65.Finland      66.France        67.Germany       68.  Greece               69.Hungary      70.Iceland");
				 System.out.println("71.Ireland     72.Italy           73. Isle of Man   74.Kosovo      75.Latvia       76.Liechtenstein 77.Lithuania     78. Luxembourg            79.Macedonia    80.Malta");
				 System.out.println("81.Moldova     82.Monaco          83.Montenegro     84.Netherlands 85.Norway       86.Poland        87.Portugal      88. Romania               89. Russia      90.San Marino");
				 System.out.println("91.Serbia      92.Slovakia        93.Slovenia       94. Spain      95.Switzerland  96.Turkey        97.Ukrania       98.United Kingdom         99.Vatican City ");
			  }        
		 void converter1()	
            {
			     j=0;
				   while(j!=5)
				      {
						   System.out.println("Enter the value of j...5.for exit");
				           j=c2.nextInt();
						   if(j!=5)
						      {
							      System.out.println("Enter the choice of Country from list");
                                  chh=c2.nextInt();
                                  switch(chh)
                                        {
											 case 51:	 
                                                    ZoneId z51=ZoneId.of("Europe/Tirane");
													LocalDateTime t51=LocalDateTime.now(z51);
													DateTimeFormatter f51=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt51=t51.format(f51);
													OffsetDateTime o51 = OffsetDateTime.now(z51);  
                                                    System.out.println("The day of Albania="+o51.getDayOfWeek());
                                                    System.out.println("The date and time of Albania  "+fdt51);
                                                    break;
											 case 52:	 
                                                    ZoneId z52=ZoneId.of("Europe/Andorra");
													LocalDateTime t52=LocalDateTime.now(z52);
													DateTimeFormatter f52=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt52=t52.format(f52);
													OffsetDateTime o52 = OffsetDateTime.now(z52);  
                                                    System.out.println("The day of Andorra="+o52.getDayOfWeek());
                                                    System.out.println("The date and time of Andorra "+fdt52);
                                                    break;	
											 case 53:	 
                                                    ZoneId z53=ZoneId.of("Europe/Gibraltar");
													LocalDateTime t53=LocalDateTime.now(z53);
													DateTimeFormatter f53=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt53=t53.format(f53);
													OffsetDateTime o53 = OffsetDateTime.now(z53);  
                                                    System.out.println("The day of Gibraltar="+o53.getDayOfWeek());
                                                    System.out.println("The date and time of Gibraltar  "+fdt53);
                                                    break;		
											  
                                              case 54:	 
                                                    ZoneId z54=ZoneId.of("Europe/Vienna");
													LocalDateTime t54=LocalDateTime.now(z54);
													DateTimeFormatter f54=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt54=t54.format(f54);
													 OffsetDateTime o54 = OffsetDateTime.now(z54);  
                                                   System.out.println("The day of Austria="+o54.getDayOfWeek());
                                                    System.out.println("The date and time of Austria  "+fdt54);
                                                    break;
                                              case 55:	 
                                                    ZoneId z55=ZoneId.of("Europe/Istanbul");
													LocalDateTime t55=LocalDateTime.now(z55);
													DateTimeFormatter f55=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt55=t55.format(f55);
													OffsetDateTime o55 = OffsetDateTime.now(z55);  
                                                    System.out.println("The day of Ukrania="+o55.getDayOfWeek());
                                                    System.out.println("The date and time of Ukrania  "+fdt55);
                                                    break;
                                              case 56:	 
                                                    ZoneId z56=ZoneId.of("Europe/Minsk");
													LocalDateTime t56=LocalDateTime.now(z56);
													DateTimeFormatter f56=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt56=t56.format(f56);
													 OffsetDateTime o56 = OffsetDateTime.now(z56);  
                                                   System.out.println("The day of Belarus="+o56.getDayOfWeek());
                                                    System.out.println("The date and time of Belarus  "+fdt56);
                                                    break;	
                                              case 57:	 
                                                    ZoneId z57=ZoneId.of("Europe/Brussels");
													LocalDateTime t57=LocalDateTime.now(z57);
													DateTimeFormatter f57=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt57=t57.format(f57);
													 OffsetDateTime o57 = OffsetDateTime.now(z57);  
                                                   System.out.println("The day of Belgium="+o57.getDayOfWeek());
                                                    System.out.println("The date and time of Belgium  "+fdt57);
                                                    break;
                                              case 58:	 
                                                    ZoneId z58=ZoneId.of("Europe/Sarajevo");
													LocalDateTime t58=LocalDateTime.now(z58);
													DateTimeFormatter f58=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt58=t58.format(f58);
													 OffsetDateTime o58 = OffsetDateTime.now(z58);  
                                                   System.out.println("The day of Bosina and Harzegovina="+o58.getDayOfWeek());
                                                    System.out.println("The date and time of Bosina and Harzegovina  "+fdt58);
                                                    break;
                                             case 59:	 
                                                    ZoneId z59=ZoneId.of("Europe/Zagreb");
													LocalDateTime t59=LocalDateTime.now(z59);
													DateTimeFormatter f59=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt59=t59.format(f59);
													 OffsetDateTime o59 = OffsetDateTime.now(z59);  
                                                   System.out.println("The day of Croatia="+o59.getDayOfWeek());
                                                    System.out.println("The date and time of Croatia  "+fdt59);
                                                    break;
                                             case 60:	 
                                                    ZoneId z60=ZoneId.of("Europe/Nicosia");
													LocalDateTime t60=LocalDateTime.now(z60);
													DateTimeFormatter f60=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt60=t60.format(f60);
													 OffsetDateTime o60 = OffsetDateTime.now(z60);  
                                                   System.out.println("The day of Cyprus="+o60.getDayOfWeek());
                                                    System.out.println("The date and time of Cyprus  "+fdt60);
                                                    break;	
                                             case 61:	 
                                                    ZoneId z61=ZoneId.of("Europe/Prague");
													LocalDateTime t61=LocalDateTime.now(z61);
													DateTimeFormatter f61=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt61=t61.format(f61);
													 OffsetDateTime o61 = OffsetDateTime.now(z61);  
                                                   System.out.println("The day of Czech Republic="+o61.getDayOfWeek());
                                                    System.out.println("The date and time of Czech Republic  "+fdt61);
                                                    break;
											 case 62:	 
                                                    ZoneId z62=ZoneId.of("Europe/Copenhagen");
													LocalDateTime t62=LocalDateTime.now(z62);
													DateTimeFormatter f62=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt62=t62.format(f62);
													 OffsetDateTime o62 = OffsetDateTime.now(z62);  
                                                   System.out.println("The day of Denmark="+o62.getDayOfWeek());
                                                    System.out.println("The date and time of Denmark  "+fdt62);
                                                    break;		
                                             case 63:	 
                                                    ZoneId z63=ZoneId.of("Europe/Tallinn");
													LocalDateTime t63=LocalDateTime.now(z63);
													DateTimeFormatter f63=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt63=t63.format(f63);
													 OffsetDateTime o63 = OffsetDateTime.now(z63);  
                                                   System.out.println("The day of Estonia="+o63.getDayOfWeek());
                                                    System.out.println("The date and time of Estonia  "+fdt63);
                                                    break;
                                              case 64:	 
                                                    ZoneId z64=ZoneId.of("Europe/Helsinki");
													LocalDateTime t64=LocalDateTime.now(z64);
													DateTimeFormatter f64=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt64=t64.format(f64);
													 OffsetDateTime o64 = OffsetDateTime.now(z64);  
                                                   System.out.println("The day of Finland="+o64.getDayOfWeek());
                                                    System.out.println("The date and time of Finland  "+fdt64);
                                                    break;
											  case 65:	 
                                                    ZoneId z65=ZoneId.of("Europe/Paris");
													LocalDateTime t65=LocalDateTime.now(z65);
													DateTimeFormatter f65=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt65=t65.format(f65);
													 OffsetDateTime o65 = OffsetDateTime.now(z65);  
                                                   System.out.println("The day of France="+o65.getDayOfWeek());
                                                    System.out.println("The date and time of France  "+fdt65);
                                                    break;
	                                         case 66:	 
                                                    ZoneId z66=ZoneId.of("Europe/Berlin");
													LocalDateTime t66=LocalDateTime.now(z66);
													DateTimeFormatter f66=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt66=t66.format(f66);
													 OffsetDateTime o66 = OffsetDateTime.now(z66);  
                                                   System.out.println("The day of Germany="+o66.getDayOfWeek());
                                                    System.out.println("The date and time of Germany  "+fdt66);
                                                    break;
	                                          case 67:	 
                                                    ZoneId z67=ZoneId.of("Europe/Athens");
													LocalDateTime t67=LocalDateTime.now(z67);
													DateTimeFormatter f67=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt67=t67.format(f67);
													 OffsetDateTime o67 = OffsetDateTime.now(z67);  
                                                   System.out.println("The day of Greece="+o67.getDayOfWeek());
                                                    System.out.println("The date and time of Greece  "+fdt67);
                                                    break;
                                              case 68:	 
                                                    ZoneId z68=ZoneId.of("Europe/Budapest");
													LocalDateTime t68=LocalDateTime.now(z68);
													DateTimeFormatter f68=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt68=t68.format(f68);
													 OffsetDateTime o68 = OffsetDateTime.now(z68);  
                                                   System.out.println("The day of Hungary="+o68.getDayOfWeek());
                                                    System.out.println("The date and time of Hungary  "+fdt68);
                                                    break;
                                              case 69:	 
                                                    ZoneId z69=ZoneId.of("Europe/Copenhagen");
													LocalDateTime t69=LocalDateTime.now(z69);
													DateTimeFormatter f69=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt69=t69.format(f69);
													 OffsetDateTime o69 = OffsetDateTime.now(z69);  
                                                   System.out.println("The day of Iceland="+o69.getDayOfWeek());
                                                    System.out.println("The date and time of Iceland  "+fdt69);
                                                    break;
                                              case 70:	 
                                                    ZoneId z70=ZoneId.of("Europe/Dublin");
													LocalDateTime t70=LocalDateTime.now(z70);
													DateTimeFormatter f70=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt70=t70.format(f70);
													 OffsetDateTime o70 = OffsetDateTime.now(z70);  
                                                   System.out.println("The day of Ireland="+o70.getDayOfWeek());
                                                    System.out.println("The date and time of Ireland  "+fdt70);
                                                    break;
                                              case 71:	 
                                                    ZoneId z71=ZoneId.of("Europe/Rome");
													LocalDateTime t71=LocalDateTime.now(z71);
													DateTimeFormatter f71=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt71=t71.format(f71);
													 OffsetDateTime o71 = OffsetDateTime.now(z71);  
                                                   System.out.println("The day of Italy="+o71.getDayOfWeek());
                                                    System.out.println("The date and time of Italy  "+fdt71);
                                                    break;
                                              case 72:	 
                                                    ZoneId z72=ZoneId.of("Europe/Isle_of_Man");
													LocalDateTime t72=LocalDateTime.now(z72);
													DateTimeFormatter f72=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt72=t72.format(f72);
													 OffsetDateTime o72 = OffsetDateTime.now(z72);  
                                                   System.out.println("The day of Isle of Man="+o72.getDayOfWeek());
                                                    System.out.println("The date and time of Isle of Man  "+fdt72);
                                                    break;
                                              case 73:	 
                                                    ZoneId z73=ZoneId.of("Europe/Skopje");
													LocalDateTime t73=LocalDateTime.now(z73);
													DateTimeFormatter f73=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt73=t73.format(f73);
													 OffsetDateTime o73 = OffsetDateTime.now(z73);  
                                                   System.out.println("The day of Kosovo="+o73.getDayOfWeek());
                                                    System.out.println("The date and time of Kosovo  "+fdt73);
                                                    break;
                                              case 74:	 
                                                    ZoneId z74=ZoneId.of("Europe/Riga");
													LocalDateTime t74=LocalDateTime.now(z74);
													DateTimeFormatter f74=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt74=t74.format(f74);
													 OffsetDateTime o74 = OffsetDateTime.now(z74);  
                                                   System.out.println("The day of Latvia="+o74.getDayOfWeek());
                                                    System.out.println("The date and time of Latvia  "+fdt74);
                                                    break;
                                             case 75:	 
                                                    ZoneId z75=ZoneId.of("Europe/Vaduz");
													LocalDateTime t75=LocalDateTime.now(z75);
													DateTimeFormatter f75=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt75=t75.format(f75);
													 OffsetDateTime o75 = OffsetDateTime.now(z75);  
                                                   System.out.println("The day of Liechtenstein="+o75.getDayOfWeek());
                                                    System.out.println("The date and time of Liechtenstein  "+fdt75);
                                                    break;			
                                             case 76:	 
                                                    ZoneId z76=ZoneId.of("Europe/Vilnius");
													LocalDateTime t76=LocalDateTime.now(z76);
													DateTimeFormatter f76=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt76=t76.format(f76);
													 OffsetDateTime o76 = OffsetDateTime.now(z76);  
                                                   System.out.println("The day of Lithuania="+o76.getDayOfWeek());
                                                    System.out.println("The date and time of Lithuania  "+fdt76);
                                                    break;
                                             case 77:	 
                                                    ZoneId z77=ZoneId.of("Europe/Luxembourg");
													LocalDateTime t77=LocalDateTime.now(z77);
													DateTimeFormatter f77=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt77=t77.format(f77);
													 OffsetDateTime o77 = OffsetDateTime.now(z77);  
                                                   System.out.println("The day of Luxembourg="+o77.getDayOfWeek());
                                                    System.out.println("The date and time of Luxembourg  "+fdt77);
                                                    break;
                                             case 78:	 
                                                    ZoneId z78=ZoneId.of("Europe/Skopje");
													LocalDateTime t78=LocalDateTime.now(z78);
													DateTimeFormatter f78=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt78=t78.format(f78);
													 OffsetDateTime o78 = OffsetDateTime.now(z78);  
                                                   System.out.println("The day of Macedonia="+o78.getDayOfWeek());
                                                    System.out.println("The date and time of Macedonia  "+fdt78);
                                                    break;								
                                             case 79:	 
                                                    ZoneId z79=ZoneId.of("Europe/Malta");
													LocalDateTime t79=LocalDateTime.now(z79);
													DateTimeFormatter f79=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt79=t79.format(f79);
													 OffsetDateTime o79 = OffsetDateTime.now(z79);  
                                                   System.out.println("The day of Malta="+o79.getDayOfWeek());
                                                    System.out.println("The date and time of Malta  "+fdt79);
                                                    break;
                                             case 80:	 
                                                    ZoneId z80=ZoneId.of("Europe/Chisinau");
													LocalDateTime t80=LocalDateTime.now(z80);
													DateTimeFormatter f80=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt80=t80.format(f80);
													 OffsetDateTime o80 = OffsetDateTime.now(z80);  
                                                   System.out.println("The day of Moldova="+o80.getDayOfWeek());
                                                    System.out.println("The date and time of Moldova  "+fdt80);
                                                    break;											
                                             case 81:	 
                                                    ZoneId z81=ZoneId.of("Europe/Monaco");
													LocalDateTime t81=LocalDateTime.now(z81);
													DateTimeFormatter f81=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt81=t81.format(f81);
													 OffsetDateTime o81 = OffsetDateTime.now(z81);  
                                                   System.out.println("The day of Monaco="+o81.getDayOfWeek());
                                                    System.out.println("The date and time of Monaco  "+fdt81);
                                                    break;									
                                             case 82:	 
                                                    ZoneId z82=ZoneId.of("Europe/Podgorica");
													LocalDateTime t82=LocalDateTime.now(z82);
													DateTimeFormatter f82=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt82=t82.format(f82);
													 OffsetDateTime o82 = OffsetDateTime.now(z82);  
                                                   System.out.println("The day of Montenegro="+o82.getDayOfWeek());
                                                    System.out.println("The date and time of Montenegro  "+fdt82);
                                                    break;									
                                             case 83:	 
                                                    ZoneId z83=ZoneId.of("Europe/Amsterdam");
													LocalDateTime t83=LocalDateTime.now(z83);
													DateTimeFormatter f83=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt83=t83.format(f83);
													 OffsetDateTime o83 = OffsetDateTime.now(z83);  
                                                   System.out.println("The day of Philippines="+o83.getDayOfWeek());
                                                    System.out.println("The date and time of Netherlands  "+fdt83);
                                                    break;									
                                             case 84:	 
                                                    ZoneId z84=ZoneId.of("Europe/Oslo");
													LocalDateTime t84=LocalDateTime.now(z84);
													DateTimeFormatter f84=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt84=t84.format(f84);
													 OffsetDateTime o84 = OffsetDateTime.now(z84);  
                                                   System.out.println("The day of Norway="+o84.getDayOfWeek());
                                                    System.out.println("The date and time of Norway  "+fdt84);
                                                    break;								
                                             case 85:	 
                                                    ZoneId z85=ZoneId.of("Europe/Warsaw");
													LocalDateTime t85=LocalDateTime.now(z85);
													DateTimeFormatter f85=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt85=t85.format(f85);
													 OffsetDateTime o85 = OffsetDateTime.now(z85);  
                                                   System.out.println("The day of Poland="+o85.getDayOfWeek());
                                                    System.out.println("The date and time of Poland  "+fdt85);
                                                    break;								
                                             case 86:	 
                                                    ZoneId z86=ZoneId.of("Europe/Lisbon");
													LocalDateTime t86=LocalDateTime.now(z86);
													DateTimeFormatter f86=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt86=t86.format(f86);
													 OffsetDateTime o86 = OffsetDateTime.now(z86);  
                                                   System.out.println("The day of Saudi Portugal="+o86.getDayOfWeek());
                                                    System.out.println("The date and time of Portugal  "+fdt86);
                                                    break;										
                                     		  case 87:	 
                                                    ZoneId z87=ZoneId.of("Europe/Bucharest");
													LocalDateTime t87=LocalDateTime.now(z87);
													DateTimeFormatter f87=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt87=t87.format(f87);
													 OffsetDateTime o87 = OffsetDateTime.now(z87);  
                                                   System.out.println("The day of  Romania="+o87.getDayOfWeek());
                                                    System.out.println("The date and time of Romania  "+fdt87);
                                                    break;										
                                             case 88:	 
                                                    ZoneId z88=ZoneId.of("Europe/Moscow");
													LocalDateTime t88=LocalDateTime.now(z88);
													DateTimeFormatter f88=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt88=t88.format(f88);
													 OffsetDateTime o88 = OffsetDateTime.now(z88);  
                                                   System.out.println("The day of  South Russia="+o88.getDayOfWeek());
                                                    System.out.println("The date and time of Russia  "+fdt88);
                                                    break;
                                             case 89:	 
                                                    ZoneId z89=ZoneId.of("Europe/San_Marino");
													LocalDateTime t89=LocalDateTime.now(z89);
													DateTimeFormatter f89=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt89=t89.format(f89);
													 OffsetDateTime o89 = OffsetDateTime.now(z89);  
                                                   System.out.println("The day of  San Marino="+o89.getDayOfWeek());
                                                    System.out.println("The date and time of San Marino  "+fdt89);
                                                    break;											
                                             case 90:	 
                                                    ZoneId z90=ZoneId.of("Europe/Belgrade");
													LocalDateTime t90=LocalDateTime.now(z90);
													DateTimeFormatter f90=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt90=t90.format(f90);
													 OffsetDateTime o90 = OffsetDateTime.now(z90);  
                                                   System.out.println("The day of  Serbia="+o90.getDayOfWeek());
                                                    System.out.println("The date and time of Serbia  "+fdt90);
                                                    break;									
                                             case 91:	 
                                                    ZoneId z91=ZoneId.of("Europe/Bratislava");
													LocalDateTime t91=LocalDateTime.now(z91);
													DateTimeFormatter f91=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt91=t91.format(f91);
													 OffsetDateTime o91 = OffsetDateTime.now(z91);  
                                                   System.out.println("The day of  Slovakia"+o91.getDayOfWeek());
                                                    System.out.println("The date and time of Slovakia  "+fdt91);
                                                    break;										
                                             case 92:	 
                                                    ZoneId z92=ZoneId.of("Europe/Ljubljana");
													LocalDateTime t92=LocalDateTime.now(z92);
													DateTimeFormatter f92=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt92=t92.format(f92);
													 OffsetDateTime o92 = OffsetDateTime.now(z92);  
                                                   System.out.println("The day of  Slovenia="+o92.getDayOfWeek());
                                                    System.out.println("The date and time of Slovenia  "+fdt92);
                                                    break;
											 case 93:	 
                                                    ZoneId z93=ZoneId.of("Europe/Madrid");
													LocalDateTime t93=LocalDateTime.now(z93);
													DateTimeFormatter f93=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt93=t93.format(f93);
													 OffsetDateTime o93 = OffsetDateTime.now(z93);  
                                                   System.out.println("The day of  Spain="+o93.getDayOfWeek());
                                                    System.out.println("The date and time of Spain  "+fdt93);
                                                    break;		
											 case 94:	 
                                                    ZoneId z94=ZoneId.of("Europe/Stockholm");
													LocalDateTime t94=LocalDateTime.now(z94);
													DateTimeFormatter f94=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt94=t94.format(f94);
													 OffsetDateTime o94 = OffsetDateTime.now(z94);  
                                                   System.out.println("The day of  Sweden="+o94.getDayOfWeek());
                                                    System.out.println("The date and time of Sweden  "+fdt94);
                                                    break;		
											 case 95:	 
                                                    ZoneId z95=ZoneId.of("Europe/Zurich");
													LocalDateTime t95=LocalDateTime.now(z95);
													DateTimeFormatter f95=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt95=t95.format(f95);
													 OffsetDateTime o95 = OffsetDateTime.now(z95);  
                                                   System.out.println("The day of  Switzerland="+o95.getDayOfWeek());
                                                    System.out.println("The date and time of Switzerland  "+fdt95);
                                                    break;		
											 case 96:	 
                                                    ZoneId z96=ZoneId.of("Europe/Istanbul");
													LocalDateTime t96=LocalDateTime.now(z96);
													DateTimeFormatter f96=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt96=t96.format(f96);
													 OffsetDateTime o96 = OffsetDateTime.now(z96);  
                                                   System.out.println("The day of  Turkey="+o96.getDayOfWeek());
                                                    System.out.println("The date and time of Turkey  "+fdt96);
                                                    break;		
                                             case 97:	 
                                                    ZoneId z97=ZoneId.of("Europe/Kiev");
													LocalDateTime t97=LocalDateTime.now(z97);
													DateTimeFormatter f97=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt97=t97.format(f97);
													 OffsetDateTime o97 = OffsetDateTime.now(z97);  
                                                   System.out.println("The day of  Ukranie="+o97.getDayOfWeek());
                                                    System.out.println("The date and time of  Ukranie  "+fdt97);
                                                    break;
                                             case 98:	 
                                                    ZoneId z98=ZoneId.of("Europe/London");
													LocalDateTime t98=LocalDateTime.now(z98);
													DateTimeFormatter f98=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt98=t98.format(f98);
													 OffsetDateTime o98 = OffsetDateTime.now(z98);  
                                                   System.out.println("The day of  United Kingdom="+o98.getDayOfWeek());
                                                    System.out.println("The date and time of United Kingdom "+fdt98);
                                                    break;													
										     case 99:	 
                                                    ZoneId z99=ZoneId.of("Europe/Vatican");
													LocalDateTime t99=LocalDateTime.now(z99);
													DateTimeFormatter f99=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt99=t99.format(f99);
													 OffsetDateTime o99 = OffsetDateTime.now(z99);  
                                                   System.out.println("The day of   Vatican City="+o99.getDayOfWeek());
                                                    System.out.println("The date and time of Vatican City   "+fdt99);
                                                    break;			
										    		   														   
											 default:
                                                  System.out.println("..NO THANKS..");
                                                   break;												  
										}				
                                        continue;
								    }
									break;
					        
							  
					}
			}				  
	
	}	
 class TimeConverter2 extends TimeConverter1
    {
	     int k,cho,n;
		  Scanner c3=new Scanner(System.in);
	     void countries2()
		      {
			     System.out.println("//////........................////////***********COUNTRIES OF AFRICA***********////////..........................//////");
				 System.out.println("100.Algeria     101.Angola          102.Benin              103.Botswana             104.Burkina Faso   105.Burundi       106.Carbo_Verde       107.Cameroon            108.CAR                      109.Chad");
				 System.out.println("110.Camoroso    111.DRL             112.Republic of Congo  113.Coted'Ivoire         114.Djibouti       115.Egypt         116.Equatoria_Guinea  117.Eritrea             118.Ethiopia                 119.Gabon");
				 System.out.println("120.Gambia      121. Gambia         122Guinea.             123.Guinea_Bissau        124.Kenya          125.Lesotho       126. Liberia          127.Libya               128.Madagascar               129.Malawi");
				 System.out.println("130.Mali        131.Mauritania      132.Mauritius          133. Mozambiqua          134.Namibia        135.Niger         136.  Nigeria         137.Rwanda              138. Sao Tom And Principle   139.Senegal");
				 System.out.println("140.Seychelles  141.Sierra_Leon     142.Somalia            143.South Africa         144.South_sudan    145.Sudan         146.Swaziland         147.Tanzania            148.Togo                     149.Tunisia  150.Zambia  151.Zimbabwe ");
              }
		 void converter2()	
            {
			     k=0;
				   while(k!=5)
				      {
						   System.out.println("Enter the value of k.....5.for exit");
				           k=c3.nextInt();
						   if(k!=5)
						      {
							      System.out.println("Enter the choice of Country from list");
                                  cho=c3.nextInt();
                                  switch(cho)
                                        {
											 case 100:	 
                                                    ZoneId z100=ZoneId.of("Africa/Algiers");
													LocalDateTime t100=LocalDateTime.now(z100);
													DateTimeFormatter f100=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt100=t100.format(f100);
													OffsetDateTime o100 = OffsetDateTime.now(z100);  
                                                    System.out.println("The day of Algeria="+o100.getDayOfWeek());
                                                    System.out.println("The date and time of Algeria  "+fdt100);
                                                    break;
											 case 101:	 
                                                    ZoneId z101=ZoneId.of("Africa/Luanda");
													LocalDateTime t101=LocalDateTime.now(z101);
													DateTimeFormatter f101=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt101=t101.format(f101);
													OffsetDateTime o101 = OffsetDateTime.now(z101);  
                                                    System.out.println("The day of Angola="+o101.getDayOfWeek());
                                                    System.out.println("The date and time of Angola "+fdt101);
                                                    break;	
											 case 102:	 
                                                    ZoneId z102=ZoneId.of("Africa/Porto-Novo");
													LocalDateTime t102=LocalDateTime.now(z102);
													DateTimeFormatter f102=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt102=t102.format(f102);
													OffsetDateTime o102 = OffsetDateTime.now(z102);  
                                                    System.out.println("The day of Benin="+o102.getDayOfWeek());
                                                    System.out.println("The date and time of Benin  "+fdt102);
                                                    break;		
											  
                                              case 103:	 
                                                    ZoneId z103=ZoneId.of("Africa/Gaborone");
													LocalDateTime t103=LocalDateTime.now(z103);
													DateTimeFormatter f103=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt103=t103.format(f103);
													 OffsetDateTime o103 = OffsetDateTime.now(z103);  
                                                   System.out.println("The day of Botswana="+o103.getDayOfWeek());
                                                    System.out.println("The date and time of Botswana  "+fdt103);
                                                    break;
                                              case 104:	 
                                                    ZoneId z104=ZoneId.of("Africa/Ouagadougou");
													LocalDateTime t104=LocalDateTime.now(z104);
													DateTimeFormatter f104=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt104=t104.format(f104);
													OffsetDateTime o104 = OffsetDateTime.now(z104);  
                                                    System.out.println("The day of Burkina Faso="+o104.getDayOfWeek());
                                                    System.out.println("The date and time of Burkina Faso  "+fdt104);
                                                    break;
                                              case 105:	 
                                                    ZoneId z105=ZoneId.of("Africa/Bujumbura");
													LocalDateTime t105=LocalDateTime.now(z105);
													DateTimeFormatter f105=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt105=t105.format(f105);
													 OffsetDateTime o105 = OffsetDateTime.now(z105);  
                                                   System.out.println("The day of Burundi="+o105.getDayOfWeek());
                                                    System.out.println("The date and time of Burundi  "+fdt105);
                                                    break;	
                                              case 106:	 
                                                    ZoneId z106=ZoneId.of("Atlantic/Cape_Verde");
													LocalDateTime t106=LocalDateTime.now(z106);
													DateTimeFormatter f106=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt106=t106.format(f106);
													 OffsetDateTime o106 = OffsetDateTime.now(z106);  
                                                   System.out.println("The day of Cabo_Verde="+o106.getDayOfWeek());
                                                    System.out.println("The date and time of Cabo_Verde  "+fdt106);
                                                    break;
                                              case 107:	 
                                                    ZoneId z107=ZoneId.of("Africa/Douala");
													LocalDateTime t107=LocalDateTime.now(z107);
													DateTimeFormatter f107=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt107=t107.format(f107);
													 OffsetDateTime o107 = OffsetDateTime.now(z107);  
                                                   System.out.println("The day of Cameroon="+o107.getDayOfWeek());
                                                    System.out.println("The date and time of Cameroon  "+fdt107);
                                                    break;
                                             case 108:	 
                                                    ZoneId z108=ZoneId.of("Africa/Bangui");
													LocalDateTime t108=LocalDateTime.now(z108);
													DateTimeFormatter f108=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt108=t108.format(f108);
													 OffsetDateTime o108 = OffsetDateTime.now(z108);  
                                                   System.out.println("The day of Central Africa Republic="+o108.getDayOfWeek());
                                                    System.out.println("The date and time of Central Africa Republic "+fdt108);
                                                    break;
                                             case 109:	 
                                                    ZoneId z109=ZoneId.of("Africa/Ndjamena");
													LocalDateTime t109=LocalDateTime.now(z109);
													DateTimeFormatter f109=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt109=t109.format(f109);
													 OffsetDateTime o109 = OffsetDateTime.now(z109);  
                                                   System.out.println("The day of Chad="+o109.getDayOfWeek());
                                                    System.out.println("The date and time of Chad  "+fdt109);
                                                    break;	
                                             case 110:	 
                                                    ZoneId z110=ZoneId.of("Indian/Comoro");
													LocalDateTime t110=LocalDateTime.now(z110);
													DateTimeFormatter f110=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt110=t110.format(f110);
													 OffsetDateTime o110 = OffsetDateTime.now(z110);  
                                                   System.out.println("The day of Camoros="+o110.getDayOfWeek());
                                                    System.out.println("The date and time of Camoros  "+fdt110);
                                                    break;
											 case 111:	 
                                                    ZoneId z111=ZoneId.of("Africa/Kinshasa");
													LocalDateTime t111=LocalDateTime.now(z111);
													DateTimeFormatter f111=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt111=t111.format(f111);
													 OffsetDateTime o111 = OffsetDateTime.now(z111);  
                                                   System.out.println("The day of Democratic Repubic of the Congo="+o111.getDayOfWeek());
                                                    System.out.println("The date and time of Democratic Repubic of the Congo  "+fdt111);
                                                    break;		
                                             case 112:	 
                                                    ZoneId z112=ZoneId.of("Africa/Lubumbashi");
													LocalDateTime t112=LocalDateTime.now(z112);
													DateTimeFormatter f112=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt112=t112.format(f112);
													 OffsetDateTime o112 = OffsetDateTime.now(z112);  
                                                   System.out.println("The day of Republic of the Congo="+o112.getDayOfWeek());
                                                    System.out.println("The date and time of Republic of the Congo  "+fdt112);
                                                    break;
                                              case 113:	 
                                                    ZoneId z113=ZoneId.of("Africa/Abidjan");
													LocalDateTime t113=LocalDateTime.now(z113);
													DateTimeFormatter f113=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt113=t113.format(f113);
													 OffsetDateTime o113 = OffsetDateTime.now(z113);  
                                                   System.out.println("The day of Coted'Ivoire="+o113.getDayOfWeek());
                                                    System.out.println("The date and time of Coted'Ivoire  "+fdt113);
                                                    break;
											  case 114:	 
                                                    ZoneId z114=ZoneId.of("Africa/Djibouti");
													LocalDateTime t114=LocalDateTime.now(z114);
													DateTimeFormatter f114=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt114=t114.format(f114);
													 OffsetDateTime o114 = OffsetDateTime.now(z114);  
                                                   System.out.println("The day of Djibouti="+o114.getDayOfWeek());
                                                    System.out.println("The date and time of Djibouti  "+fdt114);
                                                    break;
	                                         case 115:	 
                                                    ZoneId z115=ZoneId.of("Africa/Cairo");
													LocalDateTime t115=LocalDateTime.now(z115);
													DateTimeFormatter f115=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt115=t115.format(f115);
													 OffsetDateTime o115 = OffsetDateTime.now(z115);  
                                                   System.out.println("The day of Egypt="+o115.getDayOfWeek());
                                                    System.out.println("The date and time of Egypt  "+fdt115);
                                                    break;
	                                          case 116:	 
                                                    ZoneId z116=ZoneId.of("Africa/Malabo");
													LocalDateTime t116=LocalDateTime.now(z116);
													DateTimeFormatter f116=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt116=t116.format(f116);
													 OffsetDateTime o116 = OffsetDateTime.now(z116);  
                                                   System.out.println("The day of Equatoria_Guinea="+o116.getDayOfWeek());
                                                    System.out.println("The date and time of Equatoria_Guinea  "+fdt116);
                                                    break;
                                              case 117:	 
                                                    ZoneId z117=ZoneId.of("Africa/Asmara");
													LocalDateTime t117=LocalDateTime.now(z117);
													DateTimeFormatter f117=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt117=t117.format(f117);
													 OffsetDateTime o117 = OffsetDateTime.now(z117);  
                                                   System.out.println("The day of Eritrea="+o117.getDayOfWeek());
                                                    System.out.println("The date and time of Eritrea  "+fdt117);
                                                    break;
                                              case 118:	 
                                                    ZoneId z118=ZoneId.of("Africa/Addis_Ababa");
													LocalDateTime t118=LocalDateTime.now(z118);
													DateTimeFormatter f118=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt118=t118.format(f118);
													 OffsetDateTime o118 = OffsetDateTime.now(z118);  
                                                   System.out.println("The day of Ethiopia="+o118.getDayOfWeek());
                                                    System.out.println("The date and time of Ethiopia  "+fdt118);
                                                    break;
                                              case 119:	 
                                                    ZoneId z119=ZoneId.of("Africa/Libreville");
													LocalDateTime t119=LocalDateTime.now(z119);
													DateTimeFormatter f119=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt119=t119.format(f119);
													 OffsetDateTime o119 = OffsetDateTime.now(z119);  
                                                   System.out.println("The day of Gabon="+o119.getDayOfWeek());
                                                    System.out.println("The date and time of Gabon  "+fdt119);
                                                    break;
                                              case 120:	 
                                                    ZoneId z120=ZoneId.of("Africa/Banjul");
													LocalDateTime t120=LocalDateTime.now(z120);
													DateTimeFormatter f120=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt120=t120.format(f120);
													 OffsetDateTime o120 = OffsetDateTime.now(z120);  
                                                   System.out.println("The day of Gambia="+o120.getDayOfWeek());
                                                    System.out.println("The date and time of Gambia  "+fdt120);
                                                    break;
                                              case 121:	 
                                                    ZoneId z121=ZoneId.of("Africa/Accra");
													LocalDateTime t121=LocalDateTime.now(z121);
													DateTimeFormatter f121=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt121=t121.format(f121);
													 OffsetDateTime o121 = OffsetDateTime.now(z121);  
                                                   System.out.println("The day of Ghana="+o121.getDayOfWeek());
                                                    System.out.println("The date and time of Ghana  "+fdt121);
                                                    break;
                                              case 122:	 
                                                    ZoneId z122=ZoneId.of("Africa/Conakry");
													LocalDateTime t122=LocalDateTime.now(z122);
													DateTimeFormatter f122=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt122=t122.format(f122);
													 OffsetDateTime o122 = OffsetDateTime.now(z122);  
                                                   System.out.println("The day of Guinea="+o122.getDayOfWeek());
                                                    System.out.println("The date and time of Guinea  "+fdt122);
                                                    break;
                                              case 123:	 
                                                    ZoneId z123=ZoneId.of("Africa/Bissau");
													LocalDateTime t123=LocalDateTime.now(z123);
													DateTimeFormatter f123=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt123=t123.format(f123);
													 OffsetDateTime o123 = OffsetDateTime.now(z123);  
                                                   System.out.println("The day of Guinea_Bissau="+o123.getDayOfWeek());
                                                    System.out.println("The date and time of Guinea_Bissau  "+fdt123);
                                                    break;
                                             case 124:	 
                                                    ZoneId z124=ZoneId.of("Africa/Nairobi");
													LocalDateTime t124=LocalDateTime.now(z124);
													DateTimeFormatter f124=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt124=t124.format(f124);
													 OffsetDateTime o124 = OffsetDateTime.now(z124);  
                                                   System.out.println("The day of Kenya="+o124.getDayOfWeek());
                                                    System.out.println("The date and time of Kenya  "+fdt124);
                                                    break;			
                                             case 125:	 
                                                    ZoneId z125=ZoneId.of("Africa/Maseru");
													LocalDateTime t125=LocalDateTime.now(z125);
													DateTimeFormatter f125=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt125=t125.format(f125);
													 OffsetDateTime o125 = OffsetDateTime.now(z125);  
                                                   System.out.println("The day of Lesotho="+o125.getDayOfWeek());
                                                    System.out.println("The date and time of Lesotho  "+fdt125);
                                                    break;
                                             case 126:	 
                                                    ZoneId z126=ZoneId.of("Africa/Monrovia");
													LocalDateTime t126=LocalDateTime.now(z126);
													DateTimeFormatter f126=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt126=t126.format(f126);
													 OffsetDateTime o126 = OffsetDateTime.now(z126);  
                                                   System.out.println("The day of Liberia="+o126.getDayOfWeek());
                                                    System.out.println("The date and time of Liberia  "+fdt126);
                                                    break;
                                             case 127:	 
                                                    ZoneId z127=ZoneId.of("Africa/Tripoli");
													LocalDateTime t127=LocalDateTime.now(z127);
													DateTimeFormatter f127=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt127=t127.format(f127);
													 OffsetDateTime o127 = OffsetDateTime.now(z127);  
                                                   System.out.println("The day of Libya="+o127.getDayOfWeek());
                                                    System.out.println("The date and time of Libya  "+fdt127);
                                                    break;								
                                             case 128:	 
                                                    ZoneId z128=ZoneId.of("Indian/Antananarivo");
													LocalDateTime t128=LocalDateTime.now(z128);
													DateTimeFormatter f128=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt128=t128.format(f128);
													 OffsetDateTime o128 = OffsetDateTime.now(z128);  
                                                   System.out.println("The day of Madagascar="+o128.getDayOfWeek());
                                                    System.out.println("The date and time of Madagascar  "+fdt128);
                                                    break;
                                             case 129:	 
                                                    ZoneId z129=ZoneId.of("Africa/Blantyre");
													LocalDateTime t129=LocalDateTime.now(z129);
													DateTimeFormatter f129=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt129=t129.format(f129);
													 OffsetDateTime o129 = OffsetDateTime.now(z129);  
                                                   System.out.println("The day of Malawi="+o129.getDayOfWeek());
                                                    System.out.println("The date and time of Malawi  "+fdt129);
                                                    break;											
                                             case 130:	 
                                                    ZoneId z130=ZoneId.of("Africa/Bamako");
													LocalDateTime t130=LocalDateTime.now(z130);
													DateTimeFormatter f130=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt130=t130.format(f130);
													 OffsetDateTime o130 = OffsetDateTime.now(z130);  
                                                   System.out.println("The day of Mali="+o130.getDayOfWeek());
                                                    System.out.println("The date and time of Mali  "+fdt130);
                                                    break;									
                                             case 131:	 
                                                    ZoneId z131=ZoneId.of("Africa/Nouakchott");
													LocalDateTime t131=LocalDateTime.now(z131);
													DateTimeFormatter f131=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt131=t131.format(f131);
													 OffsetDateTime o131 = OffsetDateTime.now(z131);  
                                                   System.out.println("The day of Mauritania="+o131.getDayOfWeek());
                                                    System.out.println("The date and time of Mauritania  "+fdt131);
                                                    break;									
                                             case 132:	 
                                                    ZoneId z132=ZoneId.of("Indian/Mauritius");
													LocalDateTime t132=LocalDateTime.now(z132);
													DateTimeFormatter f132=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt132=t132.format(f132);
													 OffsetDateTime o132 = OffsetDateTime.now(z132);  
                                                   System.out.println("The day of Mauritius="+o132.getDayOfWeek());
                                                    System.out.println("The date and time of Mauritius  "+fdt132);
                                                    break;									
                                             case 133:	 
                                                    ZoneId z133=ZoneId.of("Africa/Maputo");
													LocalDateTime t133=LocalDateTime.now(z133);
													DateTimeFormatter f133=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt133=t133.format(f133);
													 OffsetDateTime o133 = OffsetDateTime.now(z133);  
                                                   System.out.println("The day of Mozambique="+o133.getDayOfWeek());
                                                    System.out.println("The date and time of Mozambique  "+fdt133);
                                                    break;								
                                             case 134:	 
                                                    ZoneId z134=ZoneId.of("Africa/Windhoek");
													LocalDateTime t134=LocalDateTime.now(z134);
													DateTimeFormatter f134=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt134=t134.format(f134);
													 OffsetDateTime o134 = OffsetDateTime.now(z134);  
                                                   System.out.println("The day of Namibia="+o134.getDayOfWeek());
                                                    System.out.println("The date and time of Namibia  "+fdt134);
                                                    break;								
                                             case 135:	 
                                                    ZoneId z135=ZoneId.of("Africa/Niamey");
													LocalDateTime t135=LocalDateTime.now(z135);
													DateTimeFormatter f135=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt135=t135.format(f135);
													 OffsetDateTime o135 = OffsetDateTime.now(z135);  
                                                   System.out.println("The day of Saudi Niger="+o135.getDayOfWeek());
                                                    System.out.println("The date and time of Niger  "+fdt135);
                                                    break;										
                                     		  case 136:	 
                                                    ZoneId z136=ZoneId.of("Africa/Lagos");
													LocalDateTime t136=LocalDateTime.now(z136);
													DateTimeFormatter f136=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt136=t136.format(f136);
													 OffsetDateTime o136 = OffsetDateTime.now(z136);  
                                                   System.out.println("The day of  Nigeria="+o136.getDayOfWeek());
                                                    System.out.println("The date and time of Nigeria  "+fdt136);
                                                    break;										
                                             case 137:	 
                                                    ZoneId z137=ZoneId.of("Africa/Kigali");
													LocalDateTime t137=LocalDateTime.now(z137);
													DateTimeFormatter f137=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt137=t137.format(f137);
													 OffsetDateTime o137 = OffsetDateTime.now(z137);  
                                                   System.out.println("The day of  South Rwanda="+o137.getDayOfWeek());
                                                    System.out.println("The date and time of Rwanda  "+fdt137);
                                                    break;
                                             case 138:	 
                                                    ZoneId z138=ZoneId.of("Africa/Sao_Tome");
													LocalDateTime t138=LocalDateTime.now(z138);
													DateTimeFormatter f138=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt138=t138.format(f138);
													 OffsetDateTime o138 = OffsetDateTime.now(z138);  
                                                   System.out.println("The day of  Sao_Tome And Principal="+o138.getDayOfWeek());
                                                    System.out.println("The date and time of  Sao_Tome And Principe  "+fdt138);
                                                    break;											
                                             case 139:	 
                                                    ZoneId z139=ZoneId.of("Africa/Dakar");
													LocalDateTime t139=LocalDateTime.now(z139);
													DateTimeFormatter f139=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt139=t139.format(f139);
													 OffsetDateTime o139 = OffsetDateTime.now(z139);  
                                                   System.out.println("The day of  Senegal="+o139.getDayOfWeek());
                                                    System.out.println("The date and time of Senegal  "+fdt139);
                                                    break;									
                                             case 140:	 
                                                    ZoneId z140=ZoneId.of("Indian/Mahe");
													LocalDateTime t140=LocalDateTime.now(z140);
													DateTimeFormatter f140=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt140=t140.format(f140);
													 OffsetDateTime o140 = OffsetDateTime.now(z140);  
                                                   System.out.println("The day of  Seychelles"+o140.getDayOfWeek());
                                                    System.out.println("The date and time of Seychelles  "+fdt140);
                                                    break;										
                                             case 141:	 
                                                    ZoneId z141=ZoneId.of("Africa/Freetown");
													LocalDateTime t141=LocalDateTime.now(z141);
													DateTimeFormatter f141=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt141=t141.format(f141);
													 OffsetDateTime o141 = OffsetDateTime.now(z141);  
                                                   System.out.println("The day of  Sierra_Leon="+o141.getDayOfWeek());
                                                    System.out.println("The date and time of Sierra_Leon  "+fdt141);
                                                    break;
											 case 142:	 
                                                    ZoneId z142=ZoneId.of("Africa/Mogadishu");
													LocalDateTime t142=LocalDateTime.now(z142);
													DateTimeFormatter f142=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt142=t142.format(f142);
													 OffsetDateTime o142 = OffsetDateTime.now(z142);  
                                                   System.out.println("The day of  Somalia="+o142.getDayOfWeek());
                                                    System.out.println("The date and time of Somalia  "+fdt142);
                                                    break;		
											 case 143:	 
                                                    ZoneId z143=ZoneId.of("Africa/Johannesburg");
													LocalDateTime t143=LocalDateTime.now(z143);
													DateTimeFormatter f143=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt143=t143.format(f143);
													 OffsetDateTime o143 = OffsetDateTime.now(z143);  
                                                   System.out.println("The day of  South Africa="+o143.getDayOfWeek());
                                                    System.out.println("The date and time of South Africa  "+fdt143);
                                                    break;		
											 case 144:	 
                                                    ZoneId z144=ZoneId.of("Africa/Juba");
													LocalDateTime t144=LocalDateTime.now(z144);
													DateTimeFormatter f144=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt144=t144.format(f144);
													 OffsetDateTime o144 = OffsetDateTime.now(z144);  
                                                   System.out.println("The day of  South_sudan="+o144.getDayOfWeek());
                                                    System.out.println("The date and time of South_sudan  "+fdt144);
                                                    break;		
											 case 145:	 
                                                    ZoneId z145=ZoneId.of("Africa/Khartoum");
													LocalDateTime t145=LocalDateTime.now(z145);
													DateTimeFormatter f145=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt145=t145.format(f145);
													 OffsetDateTime o145 = OffsetDateTime.now(z145);  
                                                   System.out.println("The day of  Sudan="+o145.getDayOfWeek());
                                                    System.out.println("The date and time of Sudan  "+fdt145);
                                                    break;		
                                             case 146:	 
                                                    ZoneId z146=ZoneId.of("Africa/Mbabane");
													LocalDateTime t146=LocalDateTime.now(z146);
													DateTimeFormatter f146=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt146=t146.format(f146);
													 OffsetDateTime o146 = OffsetDateTime.now(z146);  
                                                   System.out.println("The day of  Swaziland="+o146.getDayOfWeek());
                                                    System.out.println("The date and time of  Swaziland  "+fdt146);
                                                    break;
                                             case 147:	 
                                                    ZoneId z147=ZoneId.of("Africa/Dar_es_Salaam");
													LocalDateTime t147=LocalDateTime.now(z147);
													DateTimeFormatter f147=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt147=t147.format(f147);
													 OffsetDateTime o147 = OffsetDateTime.now(z147);  
                                                   System.out.println("The day of  Tanzania"+o147.getDayOfWeek());
                                                    System.out.println("The date and time of Tanzania "+fdt147);
                                                    break;													
										     case 148:	 
                                                    ZoneId z148=ZoneId.of("Africa/Lome");
													LocalDateTime t148=LocalDateTime.now(z148);
													DateTimeFormatter f148=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt148=t148.format(f148);
													 OffsetDateTime o148 = OffsetDateTime.now(z148);  
                                                   System.out.println("The day of  Togo="+o148.getDayOfWeek());
                                                    System.out.println("The date and time of Togo   "+fdt148);
                                                    break;	
                                             case 149:	 
                                                    ZoneId z149=ZoneId.of("Africa/Tunis");
													LocalDateTime t149=LocalDateTime.now(z149);
													DateTimeFormatter f149=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt149=t149.format(f149);
													 OffsetDateTime o149 = OffsetDateTime.now(z149);  
                                                   System.out.println("The day of  Tunisia="+o149.getDayOfWeek());
                                                    System.out.println("The date and time of Tunisia   "+fdt149);
                                                    break;
                                             case 150:	 
                                                    ZoneId z150=ZoneId.of("Africa/Lusaka");
													LocalDateTime t150=LocalDateTime.now(z150);
													DateTimeFormatter f150=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt150=t150.format(f150);
													 OffsetDateTime o150 = OffsetDateTime.now(z150);  
                                                   System.out.println("The day of  Zambia="+o150.getDayOfWeek());
                                                    System.out.println("The date and time of Zambia   "+fdt150);
                                                    break;													
										     case 151:	 
                                                    ZoneId z151=ZoneId.of("Africa/Harare");
													LocalDateTime t151=LocalDateTime.now(z151);
													DateTimeFormatter f151=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt151=t151.format(f151);
													 OffsetDateTime o151 = OffsetDateTime.now(z151);  
                                                   System.out.println("The day of  Zimbabwe="+o151.getDayOfWeek());
                                                    System.out.println("The date and time of Zimbabwe   "+fdt151);
                                                    break;		   														   
											 default:
                                                  System.out.println("..NO THANKS..");
                                                   break;												  
										}				
                                        continue;
								    }
									break;
					        
							}  
					}	  
   }
 class TimeConverter3 extends TimeConverter2
    {    
	     int l,choi;
		  Scanner c4=new Scanner(System.in);
	     void countries3()
		      {
			     System.out.println("//////........................////////***********COUNTRIES OF NORTH AMERICA***********////////..........................//////");
				 System.out.println("152.Antigua        153.Bahamas             154.Barbados     155.Belize               156.Canada        157.Costa_Rica    158.Cuba          159.Dominica               160.Dominican_Republic     161.EL_Salvador");
				 System.out.println("162.Guatemala      163.Grenada             164.Haiti        165.Honduras             166.Jamaica       167.Maxico        168.Nicargua      169.Panama                 170.Saint_Kitts_Nevis      171.Saint_Lucia");
				 System.out.println("172.Saint_Vincent  173.Trinidad            174.USa       ");
			  }
		 void converter3()
            {
			       l=0;
				   while(l!=5)
				      {
					           System.out.println("Enter the value of l...5.exit");
				               l=c4.nextInt();
							   if(l!=5)
							        {
									     System.out.println("Enter the choice of Country from list");
                                         choi=c4.nextInt(); 
										 switch(choi)
										      {
											         case 152:	 
                                                    ZoneId z152=ZoneId.of("America/Antigua");
													LocalDateTime t152=LocalDateTime.now(z152);
													DateTimeFormatter f152=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt152=t152.format(f152);
													OffsetDateTime o152 = OffsetDateTime.now(z152);  
                                                    System.out.println("The day of Antigua and Barbuda="+o152.getDayOfWeek());
                                                    System.out.println("The date and time of Antigua and Barbuda  "+fdt152);
                                                    break;
											 case 153:	 
                                                    ZoneId z153=ZoneId.of("America/Nassau");
													LocalDateTime t153=LocalDateTime.now(z153);
													DateTimeFormatter f153=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt153=t153.format(f153);
													OffsetDateTime o153 = OffsetDateTime.now(z153);  
                                                    System.out.println("The day of Bahamas="+o153.getDayOfWeek());
                                                    System.out.println("The date and time of Bahamas "+fdt153);
                                                    break;	
											 case 154:	 
                                                    ZoneId z154=ZoneId.of("America/Barbados");
													LocalDateTime t154=LocalDateTime.now(z154);
													DateTimeFormatter f154=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt154=t154.format(f154);
													OffsetDateTime o154 = OffsetDateTime.now(z154);  
                                                    System.out.println("The day of Barbados="+o154.getDayOfWeek());
                                                    System.out.println("The date and time of Barbados  "+fdt154);
                                                    break;		
											  
                                              case 155:	 
                                                    ZoneId z155=ZoneId.of("America/Belize");
													LocalDateTime t155=LocalDateTime.now(z155);
													DateTimeFormatter f155=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt155=t155.format(f155);
													 OffsetDateTime o155 = OffsetDateTime.now(z155);  
                                                   System.out.println("The day of Belize="+o155.getDayOfWeek());
                                                    System.out.println("The date and time of Belize  "+fdt155);
                                                    break;
                                              case 156:	 
                                                    ZoneId z156=ZoneId.of("America/Halifax");
													LocalDateTime t156=LocalDateTime.now(z156);
													DateTimeFormatter f156=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt156=t156.format(f156);
													OffsetDateTime o156 = OffsetDateTime.now(z156);  
                                                    System.out.println("The day of Canada="+o156.getDayOfWeek());
                                                    System.out.println("The date and time of Canada  "+fdt156);
                                                    break;
                                              case 157:	 
                                                    ZoneId z157=ZoneId.of("America/Costa_Rica");
													LocalDateTime t157=LocalDateTime.now(z157);
													DateTimeFormatter f157=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt157=t157.format(f157);
													 OffsetDateTime o157 = OffsetDateTime.now(z157);  
                                                   System.out.println("The day of Costa_Rica="+o157.getDayOfWeek());
                                                    System.out.println("The date and time of Costa_Rica  "+fdt157);
                                                    break;	
                                              case 158:	 
                                                    ZoneId z158=ZoneId.of("America/Havana");
													LocalDateTime t158=LocalDateTime.now(z158);
													DateTimeFormatter f158=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt158=t158.format(f158);
													 OffsetDateTime o158 = OffsetDateTime.now(z158);  
                                                   System.out.println("The day of Cuba="+o158.getDayOfWeek());
                                                    System.out.println("The date and time of Cuba  "+fdt158);
                                                    break;
                                              case 159:	 
                                                    ZoneId z159=ZoneId.of("America/Dominica");
													LocalDateTime t159=LocalDateTime.now(z159);
													DateTimeFormatter f159=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt159=t159.format(f159);
													 OffsetDateTime o159 = OffsetDateTime.now(z159);  
                                                   System.out.println("The day of Dominica="+o159.getDayOfWeek());
                                                    System.out.println("The date and time of Dominica  "+fdt159);
                                                    break;
                                             case 160:	 
                                                    ZoneId z160=ZoneId.of("America/Santo_Domingo");
													LocalDateTime t160=LocalDateTime.now(z160);
													DateTimeFormatter f160=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt160=t160.format(f160);
													 OffsetDateTime o160 = OffsetDateTime.now(z160);  
                                                   System.out.println("The day of Dominican_Republic="+o160.getDayOfWeek());
                                                    System.out.println("The date and time of Dominican_Republic "+fdt160);
                                                    break;
                                             case 161:	 
                                                    ZoneId z161=ZoneId.of("America/El_Salvador");
													LocalDateTime t161=LocalDateTime.now(z161);
													DateTimeFormatter f161=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt161=t161.format(f161);
													 OffsetDateTime o161 = OffsetDateTime.now(z161);  
                                                   System.out.println("The day of EL_Salvador="+o161.getDayOfWeek());
                                                    System.out.println("The date and time of EL_Salvador  "+fdt161);
                                                    break;	
                                             case 162:	 
                                                    ZoneId z162=ZoneId.of("America/Guatemala");
													LocalDateTime t162=LocalDateTime.now(z162);
													DateTimeFormatter f162=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt162=t162.format(f162);
													 OffsetDateTime o162 = OffsetDateTime.now(z162);  
                                                   System.out.println("The day of Guatemala="+o162.getDayOfWeek());
                                                    System.out.println("The date and time of Guatemala  "+fdt162);
                                                    break;
											 case 163:	 
                                                    ZoneId z163=ZoneId.of("America/Grenada");
													LocalDateTime t163=LocalDateTime.now(z163);
													DateTimeFormatter f163=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt163=t163.format(f163);
													 OffsetDateTime o163 = OffsetDateTime.now(z163);  
                                                   System.out.println("The day of Grenada="+o163.getDayOfWeek());
                                                    System.out.println("The date and time of Grenada  "+fdt163);
                                                    break;		
                                             case 164:	 
                                                    ZoneId z164=ZoneId.of("America/Port-au-Prince");
													LocalDateTime t164=LocalDateTime.now(z164);
													DateTimeFormatter f164=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt164=t164.format(f164);
													 OffsetDateTime o164 = OffsetDateTime.now(z164);  
                                                   System.out.println("The day of Haiti="+o164.getDayOfWeek());
                                                    System.out.println("The date and time of Haiti  "+fdt164);
                                                    break;
                                              case 165:	 
                                                    ZoneId z165=ZoneId.of("America/Tegucigalpa");
													LocalDateTime t165=LocalDateTime.now(z165);
													DateTimeFormatter f165=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt165=t165.format(f165);
													 OffsetDateTime o165 = OffsetDateTime.now(z165);  
                                                   System.out.println("The day of Honduras="+o165.getDayOfWeek());
                                                    System.out.println("The date and time of Honduras  "+fdt165);
                                                    break;
											  case 166:	 
                                                    ZoneId z166=ZoneId.of("America/Jamaica");
													LocalDateTime t166=LocalDateTime.now(z166);
													DateTimeFormatter f166=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt166=t166.format(f166);
													 OffsetDateTime o166 = OffsetDateTime.now(z166);  
                                                   System.out.println("The day of Jamaica="+o166.getDayOfWeek());
                                                    System.out.println("The date and time of Jamaica  "+fdt166);
                                                    break;
	                                         case 167:	 
                                                    ZoneId z167=ZoneId.of("America/Mexico_City");
													LocalDateTime t167=LocalDateTime.now(z167);
													DateTimeFormatter f167=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt167=t167.format(f167);
													 OffsetDateTime o167 = OffsetDateTime.now(z167);  
                                                   System.out.println("The day of Mexico="+o167.getDayOfWeek());
                                                    System.out.println("The date and time of Mexico  "+fdt167);
                                                    break;
	                                          case 168:	 
                                                    ZoneId z168=ZoneId.of("America/Managua");
													LocalDateTime t168=LocalDateTime.now(z168);
													DateTimeFormatter f168=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt168=t168.format(f168);
													 OffsetDateTime o168 = OffsetDateTime.now(z168);  
                                                   System.out.println("The day of Nicaragua="+o168.getDayOfWeek());
                                                    System.out.println("The date and time of Nicaragua  "+fdt168);
                                                    break;
                                              case 169:	 
                                                    ZoneId z169=ZoneId.of("America/Panama");
													LocalDateTime t169=LocalDateTime.now(z169);
													DateTimeFormatter f169=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt169=t169.format(f169);
													 OffsetDateTime o169 = OffsetDateTime.now(z169);  
                                                   System.out.println("The day of Panama="+o169.getDayOfWeek());
                                                    System.out.println("The date and time of Panama  "+fdt169);
                                                    break;
                                              case 170:	 
                                                    ZoneId z170=ZoneId.of("America/St_Kitts");
													LocalDateTime t170=LocalDateTime.now(z170);
													DateTimeFormatter f170=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt170=t170.format(f170);
													 OffsetDateTime o170 = OffsetDateTime.now(z170);  
                                                   System.out.println("The day of Saint_Kitts_Nevis="+o170.getDayOfWeek());
                                                    System.out.println("The date and time of Saint_Kitts_Nevis  "+fdt170);
                                                    break;
                                              case 171:	 
                                                    ZoneId z171=ZoneId.of("America/St_Lucia");
													LocalDateTime t171=LocalDateTime.now(z171);
													DateTimeFormatter f171=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt171=t171.format(f171);
													 OffsetDateTime o171 = OffsetDateTime.now(z171);  
                                                   System.out.println("The day of Saint_Lucia="+o171.getDayOfWeek());
                                                    System.out.println("The date and time of Saint_Lucia  "+fdt171);
                                                    break;
                                              case 172:	 
                                                    ZoneId z172=ZoneId.of("America/St_Vincent");
													LocalDateTime t172=LocalDateTime.now(z172);
													DateTimeFormatter f172=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt172=t172.format(f172);
													 OffsetDateTime o172 = OffsetDateTime.now(z172);  
                                                   System.out.println("The day of Saint_Vincent and The Grenadines="+o172.getDayOfWeek());
                                                    System.out.println("The date and time of Saint_Vincent and The Grenadines  "+fdt172);
                                                    break;
                                              case 173:	 
                                                    ZoneId z173=ZoneId.of("America/Port_of_Spain");
													LocalDateTime t173=LocalDateTime.now(z173);
													DateTimeFormatter f173=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt173=t173.format(f173);
													 OffsetDateTime o173 = OffsetDateTime.now(z173);  
                                                   System.out.println("The day of Trinidad and Tobago="+o173.getDayOfWeek());
                                                    System.out.println("The date and time of Trinidad and Tobago  "+fdt173);
                                                    break;
                                              case 174:	 
                                                    ZoneId z174=ZoneId.of("America/New_York");
													LocalDateTime t174=LocalDateTime.now(z174);
													DateTimeFormatter f174=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt174=t174.format(f174);
													 OffsetDateTime o174 = OffsetDateTime.now(z174);  
                                                   System.out.println("The day of United State of America="+o174.getDayOfWeek());
                                                    System.out.println("The date and time of United State of America  "+fdt174);
                                                    break;
                                              default :
											       System.out.println("...NO THANKS...");
												   break; 
											  }
									          continue;
									}
									break;
					  }
			}		 
    }  
class TimeConverter4 extends TimeConverter3
    {
	     int m,choic;
		  Scanner c5=new Scanner(System.in);
		   void countries4()
		     {
			      System.out.println("//////........................////////***********COUNTRIES OF SOUTH AMERICA***********////////..........................//////");
				  System.out.println("175.Argentina  176.Bolivia  177.Brazil  178.Chile  179.Colombia  180.Ecuador  181.Guyana  182.Paraguay  183.Peru  184.Suriname  185.Uruguay  186.Venezue ");
			 }
			void converter4()
             {
			         m=0;
				   while(m!=5)
				    {
						   System.out.println("Enter the value of m...5.exit");
				           m=c5.nextInt();
						   if(m!=5)
						    {
							      System.out.println("Enter the choice of Country from list");
                                  choic=c5.nextInt();
                                  switch(choic)
                                        {
											 case 175:	 
                                                    ZoneId z175=ZoneId.of("America/Argentina/Cordoba");
													LocalDateTime t175=LocalDateTime.now(z175);
													DateTimeFormatter f175=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt175=t175.format(f175);
													OffsetDateTime o175 = OffsetDateTime.now(z175);  
                                                    System.out.println("The day of Argentina="+o175.getDayOfWeek());
                                                    System.out.println("The date and time of Argentina  "+fdt175);
                                                    break;
											 case 176:	 
                                                    ZoneId z176=ZoneId.of("America/La_Paz");
													LocalDateTime t176=LocalDateTime.now(z176);
													DateTimeFormatter f176=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt176=t176.format(f176);
													OffsetDateTime o176 = OffsetDateTime.now(z176);  
                                                    System.out.println("The day of Bolivia="+o176.getDayOfWeek());
                                                    System.out.println("The date and time of Bolivia "+fdt176);
                                                    break;	
											 case 177:	 
                                                    ZoneId z177=ZoneId.of("America/Belem");
													LocalDateTime t177=LocalDateTime.now(z177);
													DateTimeFormatter f177=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt177=t177.format(f177);
													OffsetDateTime o177 = OffsetDateTime.now(z177);  
                                                    System.out.println("The day of Brazil="+o177.getDayOfWeek());
                                                    System.out.println("The date and time of Brazil  "+fdt177);
                                                    break;		
											  
                                              case 178:	 
                                                    ZoneId z178=ZoneId.of("America/Santiago");
													LocalDateTime t178=LocalDateTime.now(z178);
													DateTimeFormatter f178=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt178=t178.format(f178);
													 OffsetDateTime o178 = OffsetDateTime.now(z178);  
                                                   System.out.println("The day of Chile="+o178.getDayOfWeek());
                                                    System.out.println("The date and time of Chile  "+fdt178);
                                                    break;
                                              case 179:	 
                                                    ZoneId z179=ZoneId.of("America/Bogota");
													LocalDateTime t179=LocalDateTime.now(z179);
													DateTimeFormatter f179=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt179=t179.format(f179);
													OffsetDateTime o179 = OffsetDateTime.now(z179);  
                                                    System.out.println("The day of Colombia="+o179.getDayOfWeek());
                                                    System.out.println("The date and time of Colombia  "+fdt179);
                                                    break;
                                              case 180:	 
                                                    ZoneId z180=ZoneId.of("America/Guayaquil");
													LocalDateTime t180=LocalDateTime.now(z180);
													DateTimeFormatter f180=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt180=t180.format(f180);
													 OffsetDateTime o180 = OffsetDateTime.now(z180);  
                                                   System.out.println("The day of Ecuador="+o180.getDayOfWeek());
                                                    System.out.println("The date and time of Ecuador  "+fdt180);
                                                    break;	
                                              case 181:	 
                                                    ZoneId z181=ZoneId.of("America/Guyana");
													LocalDateTime t181=LocalDateTime.now(z181);
													DateTimeFormatter f181=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt181=t181.format(f181);
													 OffsetDateTime o181 = OffsetDateTime.now(z181);  
                                                   System.out.println("The day of Guyana="+o181.getDayOfWeek());
                                                    System.out.println("The date and time of Guyana  "+fdt181);
                                                    break;
                                              case 182:	 
                                                    ZoneId z182=ZoneId.of("America/Asuncion");
													LocalDateTime t182=LocalDateTime.now(z182);
													DateTimeFormatter f182=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt182=t182.format(f182);
													 OffsetDateTime o182 = OffsetDateTime.now(z182);  
                                                   System.out.println("The day of Paraguay="+o182.getDayOfWeek());
                                                    System.out.println("The date and time of Paraguay  "+fdt182);
                                                    break;
                                             case 183:	 
                                                    ZoneId z183=ZoneId.of("America/Lima");
													LocalDateTime t183=LocalDateTime.now(z183);
													DateTimeFormatter f183=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt183=t183.format(f183);
													 OffsetDateTime o183 = OffsetDateTime.now(z183);  
                                                   System.out.println("The day of Peru="+o183.getDayOfWeek());
                                                    System.out.println("The date and time of Peru "+fdt183);
                                                    break;
                                             case 184:	 
                                                    ZoneId z184=ZoneId.of("America/Paramaribo");
													LocalDateTime t184=LocalDateTime.now(z184);
													DateTimeFormatter f184=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt184=t184.format(f184);
													 OffsetDateTime o184 = OffsetDateTime.now(z184);  
                                                   System.out.println("The day of Suriname="+o184.getDayOfWeek());
                                                    System.out.println("The date and time of Suriname  "+fdt184);
                                                    break;	
                                             case 185:	 
                                                    ZoneId z185=ZoneId.of("America/Montevideo");
													LocalDateTime t185=LocalDateTime.now(z185);
													DateTimeFormatter f185=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt185=t185.format(f185);
													 OffsetDateTime o185 = OffsetDateTime.now(z185);  
                                                   System.out.println("The day of Uruguay="+o185.getDayOfWeek());
                                                    System.out.println("The date and time of Uruguay  "+fdt185);
                                                    break;
											 case 186:	 
                                                    ZoneId z186=ZoneId.of("America/Caracas");
													LocalDateTime t186=LocalDateTime.now(z186);
													DateTimeFormatter f186=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt186=t186.format(f186);
													 OffsetDateTime o186 = OffsetDateTime.now(z186);  
                                                   System.out.println("The day of Venezuela="+o186.getDayOfWeek());
                                                    System.out.println("The date and time of Venezuela  "+fdt186);
                                                    break;		
                                             
											 default :
                                                    System.out.println("...NO THANKS...");
                                                     break;
										}
                                          continue;
                             }
                                break;
				}				
	    } 
	}	
class TimeConverter5 extends TimeConverter4
    {
	     int n,choice;
		  Scanner c6=new Scanner(System.in);
		   void countries5()
             {
			     System.out.println("//////........................////////***********COUNTRIES OF AUSTRALIA AND OCEANIA***********////////..........................//////"); 
                 System.out.println("187.Australia  188.Fiji  189.Kiribati  190.Marshall_Island   191.Micronesia   192.Nauru  193.New_Zealand  194.Palau  195.Papua_New_Guinea");
                 System.out.println("196.Samoa  197.Solomon_Island  198.Tonga  199.Tuvalu   200.Vanuatu");				 
			 }	
		     void converter5()
                {
				     n=0;
				   while(n!=5)
				    {
						   System.out.println("Enter the value of n...5.exit");
				           n=c6.nextInt();
						   if(n!=5)
						    {
							      System.out.println("Enter the choice of Country from list");
                                  choice=c6.nextInt();
                                  switch(choice)
                                        {
											 case 187:	 
                                                    ZoneId z187=ZoneId.of("Australia/Lord_Howe");
													LocalDateTime t187=LocalDateTime.now(z187);
													DateTimeFormatter f187=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt187=t187.format(f187);
													OffsetDateTime o187 = OffsetDateTime.now(z187);  
                                                    System.out.println("The day of Australia="+o187.getDayOfWeek());
                                                    System.out.println("The date and time of Australia  "+fdt187);
                                                    break;
											 case 188:	 
                                                    ZoneId z188=ZoneId.of("Pacific/Fiji");
													LocalDateTime t188=LocalDateTime.now(z188);
													DateTimeFormatter f188=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt188=t188.format(f188);
													OffsetDateTime o188 = OffsetDateTime.now(z188);  
                                                    System.out.println("The day of Fiji="+o188.getDayOfWeek());
                                                    System.out.println("The date and time of Fiji "+fdt188);
                                                    break;	
											 case 189:	 
                                                    ZoneId z189=ZoneId.of("Pacific/Tarawa");
													LocalDateTime t189=LocalDateTime.now(z189);
													DateTimeFormatter f189=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt189=t189.format(f189);
													OffsetDateTime o189 = OffsetDateTime.now(z189);  
                                                    System.out.println("The day of Kiribati="+o189.getDayOfWeek());
                                                    System.out.println("The date and time of Kiribati  "+fdt189);
                                                    break;		
											  
                                              case 190:	 
                                                    ZoneId z190=ZoneId.of("Pacific/Majuro");
													LocalDateTime t190=LocalDateTime.now(z190);
													DateTimeFormatter f190=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt190=t190.format(f190);
													 OffsetDateTime o190 = OffsetDateTime.now(z190);  
                                                   System.out.println("The day of Marshall_Island="+o190.getDayOfWeek());
                                                    System.out.println("The date and time of Marshall_Island  "+fdt190);
                                                    break;
                                              case 191:	 
                                                    ZoneId z191=ZoneId.of("Pacific/Chuuk");
													LocalDateTime t191=LocalDateTime.now(z191);
													DateTimeFormatter f191=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												    String fdt191=t191.format(f191);
													OffsetDateTime o191 = OffsetDateTime.now(z191);  
                                                    System.out.println("The day of Macronesia="+o191.getDayOfWeek());
                                                    System.out.println("The date and time of Macronesia  "+fdt191);
                                                    break;
                                              case 192:	 
                                                    ZoneId z192=ZoneId.of("Pacific/Nauru");
													LocalDateTime t192=LocalDateTime.now(z192);
													DateTimeFormatter f192=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt192=t192.format(f192);
													 OffsetDateTime o192 = OffsetDateTime.now(z192);  
                                                   System.out.println("The day of Nauru="+o192.getDayOfWeek());
                                                    System.out.println("The date and time of Nauru  "+fdt192);
                                                    break;	
                                              case 193:	 
                                                    ZoneId z193=ZoneId.of("Pacific/Auckland");
													LocalDateTime t193=LocalDateTime.now(z193);
													DateTimeFormatter f193=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt193=t193.format(f193);
													 OffsetDateTime o193 = OffsetDateTime.now(z193);  
                                                   System.out.println("The day of New Zealand="+o193.getDayOfWeek());
                                                    System.out.println("The date and time of New Zealand  "+fdt193);
                                                    break;
                                              case 194:	 
                                                    ZoneId z194=ZoneId.of("Pacific/Palau");
													LocalDateTime t194=LocalDateTime.now(z194);
													DateTimeFormatter f194=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt194=t194.format(f194);
													 OffsetDateTime o194 = OffsetDateTime.now(z194);  
                                                   System.out.println("The day of Palau="+o194.getDayOfWeek());
                                                    System.out.println("The date and time of Palau  "+fdt194);
                                                    break;
                                             case 195:	 
                                                    ZoneId z195=ZoneId.of("Pacific/Port_Moresby");
													LocalDateTime t195=LocalDateTime.now(z195);
													DateTimeFormatter f195=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt195=t195.format(f195);
													 OffsetDateTime o195 = OffsetDateTime.now(z195);  
                                                   System.out.println("The day of Papua_New_Guinea="+o195.getDayOfWeek());
                                                    System.out.println("The date and time of Papua_New_Guinea "+fdt195);
                                                    break;
                                             case 196:	 
                                                    ZoneId z196=ZoneId.of("Pacific/Apia");
													LocalDateTime t196=LocalDateTime.now(z196);
													DateTimeFormatter f196=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt196=t196.format(f196);
													 OffsetDateTime o196 = OffsetDateTime.now(z196);  
                                                   System.out.println("The day of Samoa="+o196.getDayOfWeek());
                                                    System.out.println("The date and time of Samoa  "+fdt196);
                                                    break;	
                                             case 197:	 
                                                    ZoneId z197=ZoneId.of("Pacific/Guadalcanal");
													LocalDateTime t197=LocalDateTime.now(z197);
													DateTimeFormatter f197=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt197=t197.format(f197);
													 OffsetDateTime o197 = OffsetDateTime.now(z197);  
                                                   System.out.println("The day of Solomon_Island="+o197.getDayOfWeek());
                                                    System.out.println("The date and time of Solomon_Island  "+fdt197);
                                                    break;
										     case 198:	 
                                                    ZoneId z198=ZoneId.of("Pacific/Tongatapu");
													LocalDateTime t198=LocalDateTime.now(z198);
													DateTimeFormatter f198=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt198=t198.format(f198);
													 OffsetDateTime o198 = OffsetDateTime.now(z198);  
                                                   System.out.println("The day of Tonga="+o198.getDayOfWeek());
                                                    System.out.println("The date and time of Tonga  "+fdt198);
                                                    break;	
                                             case 199:	 
                                                    ZoneId z199=ZoneId.of("Pacific/Funafuti");
													LocalDateTime t199=LocalDateTime.now(z199);
													DateTimeFormatter f199=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt199=t199.format(f199);
													 OffsetDateTime o199 = OffsetDateTime.now(z199);  
                                                   System.out.println("The day of Tuvalu="+o199.getDayOfWeek());
                                                    System.out.println("The date and time of Tuvalu  "+fdt199);
                                                    break;
                                             case 200:	 
                                                    ZoneId z200=ZoneId.of("Pacific/Efate");
													LocalDateTime t200=LocalDateTime.now(z200);
													DateTimeFormatter f200=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
												   String fdt200=t200.format(f200);
													 OffsetDateTime o200 = OffsetDateTime.now(z200);  
                                                   System.out.println("The day of Vanuatu="+o200.getDayOfWeek());
                                                    System.out.println("The date and time of Vanuatu  "+fdt200);
                                                    break;													
                                             default :
                                                   System.out.println("...NO THANKS...");
                                                     break;
                                        }
                                           continue;
                            }
                               break;
                   							   
				}		  
			}	 
	}
class TimeConverter6 extends TimeConverter5
   {
         void countries6()
            {
			    System.out.println("Antarctica");
				
			}
	     void converter6()
            {
			     ZoneId z201=ZoneId.of("Antarctica/Palmer");
			     LocalDateTime t201=LocalDateTime.now(z201);
				 DateTimeFormatter f201=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		         String fdt201=t201.format(f201);
			     OffsetDateTime o201 = OffsetDateTime.now(z201);  
                 System.out.println("The day of Antarctica="+o201.getDayOfWeek());
                 System.out.println("The date and time of Antarctica  "+fdt201);
                                        
			}		 
          		
   }	
class result
{
     public static void main(String arg[])
	    {
		     
		    Scanner c=new Scanner(System.in);
		    int p,q;
		    TimeConverter6 t1=new TimeConverter6();
			p=0;
			while(p!=5)
			{
			      System.out.println("Enter the value of p......" +  "5.exit");
				  p=c.nextInt();
				  if(p!=5)
				       {
					        TimeConverter6 ob=new TimeConverter6();
					        System.out.println("Enter thr choice" +"\n"+"1.Asia    2.Europe   3.Africa   4.North America    6.South America   7.Australia and Ocean   8.Antarctica");
							 q=c.nextInt();
							 switch(q)
							       {
								          case 1:
										       ob.countries();
											   ob.converter();
											   break;
										  case 2:
                                                ob.countries1();
                                                ob.converter1();
                                                break;
                                          case 3:
                                                ob.countries2();
                                                ob.converter2();
                                                break;
                                          case 4:
                                                ob.countries3();
                                                ob.converter3();
                                                break;
                                          case 6:
                                                ob.countries4();
                                                ob.converter4();
                                                break;
                                          case 7:
                                                ob.countries5();
                                                ob.converter5();
                                                break;
                                          case 8:
                                                ob.countries6();
                                                ob.converter6();
                                                break;
                                          default:
                                                System.out.println(".......Wrong Option......");
                                                break;												
								   }
								   continue;
					   }
					   break;
			}		
		}    
}
