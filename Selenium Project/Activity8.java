Êþº¾   1 ­  #seleniumProjectActivities/Activity8  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this %LseleniumProjectActivities/Activity8; beforeMethod RuntimeVisibleAnnotations %Lorg/testng/annotations/BeforeMethod;  webdriver.gecko.driver  java/lang/StringBuilder  user.dir
    java/lang/System   getProperty &(Ljava/lang/String;)Ljava/lang/String;
   " ! java/lang/String # $ valueOf &(Ljava/lang/Object;)Ljava/lang/String;
  &  ' (Ljava/lang/String;)V ) \Drivers\geckodriver.exe
  + , - append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  / 0 1 toString ()Ljava/lang/String;
  3 4 5 setProperty 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 7 )org/openqa/selenium/firefox/FirefoxDriver
 6 	  :   < https://alchemy.hguy.co/crm/ > @ ? org/openqa/selenium/WebDriver A ' get act9 
Exceptions E java/lang/InterruptedException Lorg/testng/annotations/Test; H 	user_name
 J L K org/openqa/selenium/By M N id ,(Ljava/lang/String;)Lorg/openqa/selenium/By; > P Q R findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; T username_password V java/lang/CharSequence X admin Z \ [ org/openqa/selenium/WebElement ] ^ sendKeys ([Ljava/lang/CharSequence;)V ` pa$$w0rd b 	bigbutton Z d e  click      
 i k j java/lang/Thread l m sleep (J)V o //*[@id='grouptab_0']
 J q r N xpath t //*[@id='moduleTab_9_Accounts'] v ///*[@id="MassUpdate"]/div[3]/table/tbody//td[3] > x y z findElements *(Lorg/openqa/selenium/By;)Ljava/util/List; | ~ } java/util/List   iterator ()Ljava/util/Iterator;    java/util/Iterator   next ()Ljava/lang/Object;	     out Ljava/io/PrintStream;  The names are: Z   1 getText
    java/io/PrintStream  ' println     hasNext ()Z username  Lorg/openqa/selenium/WebElement; pwd Loginbtn menu menu1 i I 
columnList Ljava/util/List; column LocalVariableTypeTable 2Ljava/util/List<Lorg/openqa/selenium/WebElement;>; after $Lorg/testng/annotations/AfterMethod; > © ª  close 
SourceFile Activity8.java !                 	   /     *· 
±                                    	   j     4» Y¸ ¸ · %(¶ *¶ .¸ 2W*» 6Y· 8µ 9*´ 9;¹ = ±              (  3         4      B   C     D      F   	  Æ  
   ê*´ 9G¸ I¹ O L*´ 9S¸ I¹ O M+½ UYWS¹ Y ,½ UY_S¹ Y *´ 9a¸ I¹ O N-¹ c  f¸ h*´ 9n¸ p¹ O :¹ c *´ 9s¸ p¹ O :¹ c  f¸ h6*´ 9u¸ p¹ w :¹ { :	§ 8	¹  À Z:² » Y· %¹  ¶ *¶ .¶ 	  § 	¹  ÿÄ±       V         -  <  K  Q  W  g   n ! ~ "  #  $  %  & ¶ ' Ò ( Õ ) Ü * ß & é -    \ 	   ê      Û     Ì    K     g     ~ l     \      L ¡ ¢  ¶ ) £   ¤      L ¡ ¥   ¦        §   	   8     
*´ 9¹ ¨ ±       
    1 	 2        
      «    ¬