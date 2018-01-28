//this the project of icecream parllour
import java.util.Scanner;
class billing
  {  
             public static void main(String arg[])  
                {
             int venella_cone=30,blacbery_cone=30,stabery_cone=30,choco_cone=30,buterscoch_cone=30;
             int family_pack_choco=85,family_pack_venila=85,family_pack_buterscoch=85,family_pack_stabery=85;
             int choco=15,orange=15,kulfi=15,i,sum=0,n,item=0;
			 int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,m=0,j=0,k=0,l=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0,ab,aab=0,abb=0;
			 int bc,bbc=0,bcc=0,cd,ccd=0,cdd=0,de,dde=0,dee=0,ef,eef=0,eff=0,fg,fgg=0,ffg=0,gh,ggh=0,ghh=0,hi,hhi=0,hii=0,ij,ijj=0,iij=0,jk,jjk=0,jkk=0,kl,kll=0,kkl=0,lm,llm=0,lmm=0;
             System.out.println("                                          Icecream   Parller");
			 System.out.println("                                                  MENU               ");
			 System.out.println("                                       Type               Flavour             Cost");
			 System.out.println("                                     1. Simple            0) chocolate            Rs.15");
			 System.out.println("                                                          1)orange                Rs.15");
			 System.out.println("                                                          2)kulfi                 Rs.15");
			 System.out.println("                                      2. Cone             3)chocolate             Rs.30");
			 System.out.println("                                                          4)venella               Rs.30");
			 System.out.println("                                                          5)blackbery             Rs.30");
			 System.out.println("                                                          6)stabery               Rs.30");
			 System.out.println("                                                          7)buterscoch            Rs.30");
			 System.out.println("                                   3.family_pack          8) chocolate            Rs.85");
			 System.out.println("                                                          9)venilla               Rs.85");
			 System.out.println("                                                          10)buterscoch           Rs.85");
			 System.out.println("                                                          11)Stabery              Rs.85");
			 i=0;
			 while(i!=5)
			    {
				       Scanner ob=new Scanner(System.in);
					   System.out.println("Enter the value of i...");
					   i=ob.nextInt();
				      if(i!=5)
					     {
						    System.out.println("Enter the choice");
                            int ch =ob.nextInt();	
                            switch(ch)
                                {
		                                 case 0:						     
										     
										    
											 System.out.println( "do u want to reduce quantity..if YES Then press...1 or ....if want to add on then press 0...");
											 ab=ob.nextInt();
											 if(ab==0)
											    {
												     System.out.println("enter the quantity of icecream");
					                                 n=ob.nextInt();
											         a=a+n;
			                                         System.out.println("simple chocolate icecream="+choco);
											         o=choco*n;
				                                     sum=sum+choco*n;
											         System.out.println("the total cost="+sum);
												
												}										
											else if(ab==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     aab=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+aab);
													 a=a-aab;
													 o=o-choco*aab;
													 sum=sum-choco*aab;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
												
											 else{
											       System.out.println("...No....");
												   break;
											 }	
				                              
										   break;
	  								 case 1:
									       
										   System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 bc=ob.nextInt();
											 if(bc==0)
											    {
											     System.out.println("enter the quantity of icecream");
		                             			  n=ob.nextInt();
												  b=b+n;
			                                      System.out.println("simple orange icecream="+orange);
											       p=orange*n;
				                                   sum=sum+p;
				                                   System.out.println("the total cost="+sum);
												   }
											else if(bc==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     bbc=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+bbc);
													 b=b-bbc;
													 p=p-orange*bbc;
													 sum=sum-orange*bbc;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
												
											 else{
											       System.out.println("...No....");
												   break;
											 }
										       
										   break;
                                     case 2:
									          
											System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 cd=ob.nextInt();
											 if(cd==0)
											    {
												     System.out.println("enter the quantity of icecream");
				                            	n=ob.nextInt();
												c=c+n;
			                                    System.out.println("simple kulfi icecream="+kulfi);
												q=kulfi*n;
				                                 sum=sum+q;
				                                System.out.println("the total cost="+sum);
												}
											 else if(cd==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     ccd=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+ccd);
													 c=c-ccd;
													 System.out.println("the cost="+c);
													 q=q-kulfi*ccd;
													 sum=sum-kulfi*ccd;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
													
											 else
											 {
											       System.out.println("...No....");
												   break;
											 }
										      
										   break;
                                     case 3:
									   
									            
												 System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 de=ob.nextInt();
											 if(de==0)
											    {
												     System.out.println("enter the quantity of icecream");
			                              		n=ob.nextInt();
												d=d+n;
			                                    System.out.println("simple chocolate_cone icecream="+choco_cone);
												r=choco_cone*n;
				                                sum=sum+r;
				                                System.out.println("the total cost="+sum);
					                                }					
											 else if(de==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     dde=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+dde);
													 d=d-dde;
													 r=r-choco_cone*dde;
													 sum=sum-choco_cone*dde;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
												
											 else{
											       System.out.println("...No....");
												   break;
											 }
										   break;
           	                         case 4:
									          
											   System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 ef=ob.nextInt();
											 if(ef==0)
											    {
												     System.out.println("enter the quantity of icecream");
					                           n=ob.nextInt();
											   e=e+n;
			                                  System.out.println("simple venella_cone icecream="+venella_cone);
											  s=venella_cone*n;
				                              sum=sum+s;
				                              System.out.println("the total cost="+sum);
												}  
											else if(ef==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     eef=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+eef);
													 e=e-eef;
													 s=s-venella_cone*eef;
													 sum=sum-venella_cone*eef;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
												
											 else{
											       System.out.println("...No....");
												   break;
											 }

										   break;
                                     case 5:
									         System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 fg=ob.nextInt();
										  if(fg==0)
                                            {										  
											 System.out.println("enter the quantity of icecream");
					                         n=ob.nextInt();
											 f=f+n;
			                                 System.out.println("simple blacbery_cone icecream="+blacbery_cone);
											 t=blacbery_cone*n;
				                             sum=sum+t;
				                             System.out.println("the total cost="+sum);
                                             }                                
										  else if(fg==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     ffg=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+ffg);
													 f=f-ffg;
													 t=t-blacbery_cone*ffg;
													 sum=sum-blacbery_cone*ffg;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
											 else{
											       System.out.println("...No....");
												   break;
											 }
										    break;
                                     case 6:
									    
										    
											 System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 gh=ob.nextInt();
											 if(gh==0)
											    {
												       System.out.println("enter the quantity of icecream");
				                                      n=ob.nextInt();
								    		          g=g+n;
			                                          System.out.println("simple stabery_cone icecream="+stabery_cone);
											           u=stabery_cone*n;
				                                       sum=sum+u;
				                                        System.out.println("the total cost="+sum);
									            }
											else if(gh==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     ggh=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+ggh);
													 g=g-ggh;
													 u=u-stabery_cone*ggh;
													 sum=sum-stabery_cone*ggh;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
											 else{
											       System.out.println("...No....");
												   break;
											 }
										   break;
                                     case 7:
									      
										    
											 System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 hi=ob.nextInt();
											if(hi==0)
                                                {
												     System.out.println("enter the quantity of icecream");
					                                 n=ob.nextInt();
											         h=h+n;
			                                         System.out.println("simple buterscoch_cone icecream="+buterscoch_cone);
											         v=buterscoch_cone*n;
				                                     sum=sum+v;
				                                     System.out.println("the total cost="+sum);
												}												
											else if(hi==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     hhi=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+hhi);
													 h=h-hhi;
													 v=v-buterscoch_cone*hhi;
													 sum=sum-buterscoch_cone*hhi;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
											 else{
											       System.out.println("...No....");
												   break;
											 }
										   break;
                                     case 8:
									       
										   	  
											   System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 ij=ob.nextInt();
											 if(ij==0)
											     {
												     System.out.println("enter the quantity of icecream");
					                                 n=ob.nextInt();
											         m=m+n;
			                                         System.out.println("simple family_pack_chocolate icecream="+family_pack_choco);
											         w=family_pack_choco*n;
				                                     sum=sum+w;
				                                     System.out.println("the total cost="+sum);
												 }	 
											else if(ij==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     iij=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+iij);
													 m=m-iij;
													 w=w-family_pack_choco*iij;
													 sum=sum-family_pack_choco*iij;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
											 else{
											       System.out.println("...No....");
												   break;
											 }
										   break;
                                     case 9:
									         
                                              System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 jk=ob.nextInt();
											 if(jk==0)
											    {
												     System.out.println("enter the quantity of icecream");
					                         n=ob.nextInt();
										     j=j+n;
			                                 System.out.println("simple family_pack_venila icecream="+family_pack_venila);
											 x=family_pack_venila*n;
				                             sum=sum+x;
				                             System.out.println("the total cost="+sum);
												}
											else if(jk==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     jjk=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+jjk);
													 j=j-jjk;
													 x=x-family_pack_venila*jjk;
													 sum=sum-family_pack_venila*jjk;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
											 else{
											       System.out.println("...No....");
												   break;
											 }	   
										   break;
                                     case 10:
				       			            
	                                         System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 kl=ob.nextInt();
											 if(kl==0)
											    {
												     System.out.println("enter the quantity of icecream");
					                        n=ob.nextInt();
											k=k+n;
			                                System.out.println("simple family_pack_buterscoch icecream="+family_pack_buterscoch);
											y=family_pack_buterscoch*n;
				                            sum=sum+y;
				                            System.out.println("the total cost="+sum);
												}
											else if(kl==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     kkl=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+kkl);
													 k=k-kkl;
													 y=y-family_pack_buterscoch*kkl;
													 sum=sum-family_pack_buterscoch*kkl;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
											 else{
											       System.out.println("...No....");
												   break;
											 }
										   break;
                                     case 11:
						        		  
								           System.out.println("do u want to reduce quantity..if YES Then press...1 or ...if want to add on then press 0...");
											 lm=ob.nextInt();
											 if(lm==0)
											    {
												     System.out.println("enter the quantity of icecream");
					                      n=ob.nextInt();
										  l=l+n;
			                              System.out.println("simple family_pack_stabery icecream="+family_pack_stabery);
										  z=family_pack_stabery*n;
				                          sum=sum+z;
				                          System.out.println("the total cost="+sum);
												}	
											else if(lm==1)
											    {
									                 System.out.println("enter the quantity to reduce");
                                                     llm=ob.nextInt();													 
												     System.out.println("...Yes..."+"\n"+"no of quantity to reduce="+llm);
													 l=l-llm;
													 z=z-family_pack_stabery*llm;
													 sum=sum-family_pack_stabery*llm;
													  System.out.println("Now after the reduce quantity the total cost="+sum);
												}
											 else{
											       System.out.println("...No....");
												   break;
											 }
										   	break;
                                     default:
									       System.out.println("Invalid input"+"\n"+"enter the input between....(0-11)");
										  
										   break;
										   
										   
								}
                           								
                          continue;	
                          
						 						  
						 }
						 break;
						 
				}
				System.out.println("         Welcome To icecream parllour\n\n        ");
				if(a!=0)
				   {
				        System.out.println(+a+" "+"piece"+"  "+"simple chocolate ice cream"+"        "+"Rs."+o+"\n");
				   }
				if(b!=0)
				   {
				        System.out.println(+b+" "+"piece"+"  "+"simple orange ice cream"+"        "+"Rs."+p+"\n");
				   }
               if(c!=0)
				   {
				        System.out.println(+c+" "+"piece"+"  "+"simple kulfi ice cream"+"        "+"Rs."+q+"\n");
				   }
               if(d!=0)
				   {
				        System.out.println(+d+" "+"piece"+"  "+"chocolate_cone ice cream"+"        "+"Rs."+r+"\n");
				   }
               if(e!=0)
				   {
				        System.out.println(+e+" "+"piece"+"  "+"venella_cone ice cream"+"        "+"Rs."+s+"\n");
				   }	
               if(f!=0)
				   {
				        System.out.println(+f+" "+"piece"+"  "+"blacbery_cone ice cream"+"        "+"Rs."+t+"\n");
				   }
               if(g!=0)
				   {
				        System.out.println(+g+" "+"piece"+"  "+"stabery_cone ice cream"+"        "+"Rs."+u+"\n");
				   }
               if(h!=0)
				   {
				        System.out.println(+h+" "+"piece"+"  "+"buterscoch_cone ice cream"+"        "+"Rs."+v+"\n");
				   }
                if(m!=0)
				   {
				        System.out.println(+m+" "+"piece"+"  "+"family_pack_chocolate ice cream"+"        "+"Rs."+w+"\n");
				   }
                if(j!=0)
				   {
				        System.out.println(+j+" "+"piece"+"  "+"family_pack_venila ice cream"+"        "+"Rs."+x+"\n");
				   }
                if(k!=0)
				   {
				        System.out.println(+k+" "+"piece"+"  "+"family_pack_buterscoch ice cream"+"        "+"Rs."+y+"\n");
				   }
                if(l!=0)
				   {
				        System.out.println(+l+" "+"piece"+"  "+"family_pack_stabery ice cream"+"        "+"Rs."+z+"\n");
				   }				   
				System.out.println("\n\n *****THE TOTAL COST OF ICECREAM......."+"            "+"Rs."+sum+"\n\n");
				System.out.println("                THANK YOU FOR VISITING          ");
				
				
				
         } 			 
  }