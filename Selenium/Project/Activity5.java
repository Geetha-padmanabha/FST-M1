����   1 �  #seleniumProjectActivities/Activity5  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this %LseleniumProjectActivities/Activity5; beforeMethod RuntimeVisibleAnnotations %Lorg/testng/annotations/BeforeMethod;  webdriver.gecko.driver  java/lang/StringBuilder  user.dir
    java/lang/System   getProperty &(Ljava/lang/String;)Ljava/lang/String;
   " ! java/lang/String # $ valueOf &(Ljava/lang/Object;)Ljava/lang/String;
  &  ' (Ljava/lang/String;)V ) \Drivers\geckodriver.exe
  + , - append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  / 0 1 toString ()Ljava/lang/String;
  3 4 5 setProperty 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 7 )org/openqa/selenium/firefox/FirefoxDriver
 6 	  :   < https://alchemy.hguy.co/crm/ > @ ? org/openqa/selenium/WebDriver A ' get act5 Lorg/testng/annotations/Test; E 	user_name
 G I H org/openqa/selenium/By J K id ,(Ljava/lang/String;)Lorg/openqa/selenium/By; > M N O findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; Q username_password S java/lang/CharSequence U admin W Y X org/openqa/selenium/WebElement Z [ sendKeys ([Ljava/lang/CharSequence;)V ] pa$$w0rd _ 	bigbutton W a b  click d //div[@id='toolbar']
 G f g K xpath i background-color W k l  getCssValue	  n o p out Ljava/io/PrintStream;
 r t s java/io/PrintStream u ' println username  Lorg/openqa/selenium/WebElement; pwd Loginbtn navigationMenu Ljava/lang/String; after $Lorg/testng/annotations/AfterMethod; >  �  close 
SourceFile Activity5.java !                 	   /     *� 
�                                    	   j     4� Y� � � %(� *� .� 2W*� 6Y� 8� 9*� 9;� = �              (  3         4      B        C   	   �     q*� 9D� F� L L*� 9P� F� L M+� RYTS� V ,� RY\S� V *� 9^� F� L N-� ` *� 9c� e� L h� j :� m� q�       & 	        -  <  K  Q  h  p      4    q      b v w   S x w  K & y w  h 	 z {   |        }   	   8     
*� 9� ~ �       
    $ 	 %        
      �    �