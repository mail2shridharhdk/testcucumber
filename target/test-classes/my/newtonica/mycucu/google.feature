#Feature: Google Search

#Scenario: Search 1 for 'funny'
#Given user has opened browser
#And user browses to https://www.google.com
#When user types 'funny' in search box
#And user presses enter
#Then title must start with 'funny'

#Scenario: Search 2 for 'funny'
#Given user is on google home page
#And user searches for 'funny'
#Then title must start with 'funny'