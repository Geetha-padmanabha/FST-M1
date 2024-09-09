����   1 �  stepDefinitions/AlertTestSteps  java/lang/Object driver Lorg/openqa/selenium/WebDriver; wait .Lorg/openqa/selenium/support/ui/WebDriverWait; alert Lorg/openqa/selenium/Alert; <init> ()V Code
     LineNumberTable LocalVariableTable this  LstepDefinitions/AlertTestSteps; openPage RuntimeVisibleAnnotations Lio/cucumber/java/en/Given; value ^User is on the page$  )org/openqa/selenium/firefox/FirefoxDriver
  	      ,org/openqa/selenium/support/ui/WebDriverWait       

  #  $ #(Lorg/openqa/selenium/WebDriver;J)V	  &   ( ;https://www.training-support.net/selenium/javascript-alerts * , + org/openqa/selenium/WebDriver - . get (Ljava/lang/String;)V openSimpleAlert Lio/cucumber/java/en/When; %^User clicks the Simple Alert button$ 3 #simple
 5 7 6 org/openqa/selenium/By 8 9 cssSelector ,(Ljava/lang/String;)Lorg/openqa/selenium/By; * ; < = findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; ? A @ org/openqa/selenium/WebElement B  click openConfirmAlert &^User clicks the Confirm Alert button$ F #confirm openPromptAlert %^User clicks the Prompt Alert button$ J #prompt switchFocus Lio/cucumber/java/en/Then; ^Alert opens$ * O P Q switchTo /()Lorg/openqa/selenium/WebDriver$TargetLocator; S U T +org/openqa/selenium/WebDriver$TargetLocator 	 V ()Lorg/openqa/selenium/Alert;	  X 	 
 	readAlert Lio/cucumber/java/en/And; $^Read the text from it and print it$	 ] _ ^ java/lang/System ` a out Ljava/io/PrintStream; c java/lang/StringBuilder e Alert says: 
 b g  . i k j org/openqa/selenium/Alert l m getText ()Ljava/lang/String;
 b o p q append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 b s t m toString
 v x w java/io/PrintStream y . println writeToPrompt ^Write a custom message in it$ } Custom Message i  � . sendKeys 
closeAlert ^Close the alert$ i � �  accept closeAlertWithCAncel ^Close the alert with Cancel$ i � �  dismiss closeBrowser ^Close Browser$ * � �  close 
SourceFile AlertTestSteps.java InnerClasses TargetLocator !                    	 
           /     *� �                                   s     _     )*� Y� � *� Y*�   � "� %*� '� ) �                (         )      /        0  s 1    B     *� 2� 4� : � > �       
                     C        0  s D    B     *� E� 4� : � > �       
    $  %              G        0  s H    B     *� I� 4� : � > �       
    )  *              K        L  s M    A     **� � N � R � W�       
    .  /              Y        Z  s [    M     � \� bYd� f*� W� h � n� r� u�       
    3  4              z        Z  s {    :     *� W|� ~ �       
    8  9              �        Z  s �    8     
*� W� � �       
    = 	 >        
      �        Z  s �    8     
*� W� � �       
    B 	 C        
      �        Z  s �    8     
*� � � �       
    G 	 H        
      �    � �   
  S * �	