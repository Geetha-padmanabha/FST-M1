Êþº¾   1   #seleniumProjectActivities/Activity7  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this %LseleniumProjectActivities/Activity7; beforeMethod RuntimeVisibleAnnotations %Lorg/testng/annotations/BeforeMethod;  webdriver.gecko.driver  java/lang/StringBuilder  user.dir
    java/lang/System   getProperty &(Ljava/lang/String;)Ljava/lang/String;
   " ! java/lang/String # $ valueOf &(Ljava/lang/Object;)Ljava/lang/String;
  &  ' (Ljava/lang/String;)V ) \Drivers\geckodriver.exe
  + , - append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  / 0 1 toString ()Ljava/lang/String;
  3 4 5 setProperty 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 7 )org/openqa/selenium/firefox/FirefoxDriver
 6 	  :   < https://alchemy.hguy.co/crm/ > @ ? org/openqa/selenium/WebDriver A ' get act7 
Exceptions E java/lang/InterruptedException Lorg/testng/annotations/Test; H 	user_name
 J L K org/openqa/selenium/By M N id ,(Ljava/lang/String;)Lorg/openqa/selenium/By; > P Q R findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; T username_password V java/lang/CharSequence X admin Z \ [ org/openqa/selenium/WebElement ] ^ sendKeys ([Ljava/lang/CharSequence;)V ` pa$$w0rd b 	bigbutton Z d e  click g //*[@id='grouptab_0']
 J i j N xpath l //*[@id='moduleTab_9_Leads']      '
 p r q java/lang/Thread s t sleep (J)V v #//span[@title='Additional Details'] x //span[@class='phone'] Z z { 1 getText	  } ~  out Ljava/io/PrintStream;  Phone number is :
    java/io/PrintStream  ' println username  Lorg/openqa/selenium/WebElement; pwd Loginbtn menu menu1 icon message Ljava/lang/String; after $Lorg/testng/annotations/AfterMethod; >    close 
SourceFile Activity7.java !                 	   /     *· 
±                                    	   j     4» Y¸ ¸ · %(¶ *¶ .¸ 2W*» 6Y· 8µ 9*´ 9;¹ = ±              (  3         4      B   C     D      F   	       Ï*´ 9G¸ I¹ O L*´ 9S¸ I¹ O M+½ UYWS¹ Y ,½ UY_S¹ Y *´ 9a¸ I¹ O N-¹ c *´ 9f¸ h¹ O :¹ c *´ 9k¸ h¹ O :¹ c  m¸ o*´ 9u¸ h¹ O :¹ c  m¸ o*´ 9w¸ h¹ O ¹ y :² |» Y· %¶ *¶ .¶ ±       F         -  <  K  Q  a  h  x    !  "  #  $ ¢ % · & Î '    R    Ï      À     ±    K     a n    x W     :    ·                 	   8     
*´ 9¹  ±       
    + 	 ,        
          