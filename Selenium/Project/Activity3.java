����   1 g  #seleniumProjectActivities/Activity3  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this %LseleniumProjectActivities/Activity3; beforeMethod RuntimeVisibleAnnotations %Lorg/testng/annotations/BeforeMethod;  webdriver.gecko.driver  java/lang/StringBuilder  user.dir
    java/lang/System   getProperty &(Ljava/lang/String;)Ljava/lang/String;
   " ! java/lang/String # $ valueOf &(Ljava/lang/Object;)Ljava/lang/String;
  &  ' (Ljava/lang/String;)V ) \Drivers\geckodriver.exe
  + , - append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  / 0 1 toString ()Ljava/lang/String;
  3 4 5 setProperty 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 7 )org/openqa/selenium/firefox/FirefoxDriver
 6 	  :   < https://alchemy.hguy.co/crm/ > @ ? org/openqa/selenium/WebDriver A ' get act3 Lorg/testng/annotations/Test; E admin_options
 G I H org/openqa/selenium/By J K id ,(Ljava/lang/String;)Lorg/openqa/selenium/By; > M N O findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; Q S R org/openqa/selenium/WebElement T 1 getText	  V W X out Ljava/io/PrintStream;
 Z \ [ java/io/PrintStream ] ' println 
footerText Ljava/lang/String; after $Lorg/testng/annotations/AfterMethod; > c d  close 
SourceFile Activity3.java !                 	   /     *� 
�                                    	   j     4� Y� � � %(� *� .� 2W*� 6Y� 8� 9*� 9;� = �              (  3         4      B        C   	   X     *� 9D� F� L � P L� U+� Y�                              ^ _   `        a   	   8     
*� 9� b �       
     	          
      e    f