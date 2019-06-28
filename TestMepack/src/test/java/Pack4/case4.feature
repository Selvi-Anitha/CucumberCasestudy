@tag
Feature: TDD

@tag1
Scenario: Fail user moves to payment without adding product to cart
Given ALex has registered in TestMeApp
When ALex search a particular product like HeadPhone
And Try to proceed payment without adding any item in the cart
Then TestMe doesn't display the cart icon 


@tag2
 Scenario: Pass 
 Given ALex has registered in TestMeApps
When ALex search a particular product like HeadPhones
And add product to cart
And Try to proceed payment
Then SuccesFully purchased a product

 