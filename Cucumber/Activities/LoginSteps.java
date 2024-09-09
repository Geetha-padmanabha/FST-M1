����   1 �  stepDefinitions/LoginSteps  java/lang/Object driver Lorg/openqa/selenium/WebDriver; wait .Lorg/openqa/selenium/support/ui/WebDriverWait; <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this LstepDefinitions/LoginSteps; 	loginPage RuntimeVisibleAnnotations Lio/cucumber/java/en/Given; value ^User is on Login page$  )org/openqa/selenium/firefox/FirefoxDriver
  	      ,org/openqa/selenium/support/ui/WebDriverWait       

  ! 	 " #(Lorg/openqa/selenium/WebDriver;J)V	  $   & 4https://www.training-support.net/selenium/login-form ( * ) org/openqa/selenium/WebDriver + , get (Ljava/lang/String;)V enterCredentials Lio/cucumber/java/en/When; #^User enters username and password$ 1 username
 3 5 4 org/openqa/selenium/By 6 7 id ,(Ljava/lang/String;)Lorg/openqa/selenium/By; ( 9 : ; findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; = java/lang/CharSequence ? admin A C B org/openqa/selenium/WebElement D E sendKeys ([Ljava/lang/CharSequence;)V G password I //button[@type='submit']
 3 K L 7 xpath A N O 
 click readTitleAndHeading Lio/cucumber/java/en/Then; .^Read the page title and confirmation message$ T action-confirmation
 V X W 1org/openqa/selenium/support/ui/ExpectedConditions Y Z  visibilityOfAllElementsLocatedBy L(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/support/ui/ExpectedCondition;
  \ ] ^ until 1(Ljava/util/function/Function;)Ljava/lang/Object; ( ` a b getTitle ()Ljava/lang/String; A d e b getText	 g i h java/lang/System j k out Ljava/io/PrintStream; m java/lang/StringBuilder o Page title is: 
 l q 	 ,
 l s t u append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 l w x b toString
 z | { java/io/PrintStream } , println  Login message is:  	pageTitle Ljava/lang/String; confirmMessage closeBrowser Lio/cucumber/java/en/And; ^Close the Browser$ ( � � 
 close 
SourceFile LoginSteps.java !                    	 
     /     *� �                          
         s     _     )*� Y� � *� Y*�  �  � #*� %� ' �                (         )      - 
       .  s /    �     L*� 0� 2� 8 � <Y>S� @ *� F� 2� 8 � <YFS� @ *� H� J� 8 � M �               8 " K #        L      P 
       Q  s R    �     [*� #S� 2� U� [W*� � _ L*� S� 2� 8 � c M� f� lYn� p+� r� v� y� f� lY~� p,� r� v� y�           '  )  * . , D - Z .         [      A � �  . - � �   � 
       �  s �    8     
*� � � �       
    3 	 4        
      �    �