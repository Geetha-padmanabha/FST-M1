����   1 c  #seleniumProjectActivities/Activity1  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this %LseleniumProjectActivities/Activity1; beforeMethod RuntimeVisibleAnnotations %Lorg/testng/annotations/BeforeMethod;  webdriver.gecko.driver  java/lang/StringBuilder  user.dir
    java/lang/System   getProperty &(Ljava/lang/String;)Ljava/lang/String;
   " ! java/lang/String # $ valueOf &(Ljava/lang/Object;)Ljava/lang/String;
  &  ' (Ljava/lang/String;)V ) \Drivers\geckodriver.exe
  + , - append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  / 0 1 toString ()Ljava/lang/String;
  3 4 5 setProperty 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 7 )org/openqa/selenium/firefox/FirefoxDriver
 6 	  :   < https://alchemy.hguy.co/crm/ > @ ? org/openqa/selenium/WebDriver A ' get 	testCase1 Lorg/testng/annotations/Test; > E F 1 getTitle	  H I J out Ljava/io/PrintStream; L 
Title is: 
 N P O java/io/PrintStream Q ' println S SuiteCRM
 U W V org/testng/Assert X Y assertEquals '(Ljava/lang/String;Ljava/lang/String;)V title Ljava/lang/String; afterMethod $Lorg/testng/annotations/AfterMethod; > _ `  close 
SourceFile Activity1.java !                 	   /     *� 
�                                    	   j     4� Y� � � %(� *� .� 2W*� 6Y� 8� 9*� 9;� = �              (  3         4      B        C   	   g     '*� 9� D L� G� YK� %+� *� .� M+R� T�            
     &         '     
  Z [   \        ]   	   8     
*� 9� ^ �       
     	         
      a    b