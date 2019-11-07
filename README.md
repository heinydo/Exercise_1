# Exercise 1 - Mobile Computing WS 2019
| Name          | Matrikelnummer | Kurs   |
| ------------- | -------------- | ------ |
| Dominik Heiny | 300149         | MSI SE |
| Philip Ebner  | 300453         | MSI SE |

## App: BMI Rechner 

Wir haben uns für das Pattern **MVVM** entschieden.  MVVM kombiniert die Vorteile der Trennung der von MVP bereitgestellten Anliegen mit den Vorteilen der Datenanbindung.  Es wurde dabei Views/ ViewController & ViewModels implementiert. Zukünftig können Models in Form einer Datenbank (Datenmodell) eingeführt werden. Dies war für die Implementierung des BMI-Rechners allerdings nicht von Nöten.  

Die App wurde lediglich im Emulator getestet, da uns erst ab Anfang nächster Woche (KW46) ein Android Gerät zur Verfügung stehen wird. 


### APP-Konzept

Auf dem Start-Screen hat der User die Möglichkeit Größe und Gewicht einzugeben. Beim drücken des Buttons wird der BMI-Berechnet. Der ausgerechnete BMI wird zusammen mit einer Interpretation des Wertes im Folgescreen dargestellt. Dabei erhält der Nutzer ein farblich untermaltes Feedback.


### APP-Architektur

Die View besteht aus den einzelnen Screens (Calculator & good, bad, less bad Result), die als Fragmente umgesetzt sind. Hierfür wird jeweils eine XML-Datei und eine zugehörige Kotlin Klasse implementiert. 
Das ViewModel wurde für den Calculator-Screen implementiert. Hier wird die Berechnung des BMIs vorgenommen und je nach Ergebnis, der entsprechende Result-Screen aufgerufen. 
