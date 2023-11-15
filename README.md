# Zalando.lt E-commerce Website Automated Tests

This repository contains automated tests for the Zalando.lt e-commerce website. The tests cover the functionality of various pages, including the Cart, Login, Logout, Registration, Account deletion and Search pages.

## Automated Test Scenarios

### 1. CheckOutBagPage

#### Scenario 1: Add Item to Cart
- **Given** a user is on the product page
- **When** the user clicks on the "Add to Cart" button for a product
- **Then** the item should be added to the shopping cart
- **And** the cart icon should display the updated item count

#### Scenario 2: Remove Item from Cart
- **Given** a user has items in the shopping cart
- **When** the user navigates to the cart page
- **And** removes an item from the cart
- **Then** the item should be removed from the cart
- **And** the cart icon should display the updated item count

### 2. LoginPage

#### Scenario 1: Successful Login
- **Given** a registered user navigates to the login page
- **When** the user enters valid credentials
- **And** clicks the "Login" button
- **Then** the user should be redirected to the home page
- **And** the user's name should be displayed indicating a successful login

#### Scenario 2: Invalid Login
- **Given** a user navigates to the login page
- **When** the user enters invalid credentials
- **And** clicks the "Login" button
- **Then** an error message should be displayed
- **And** the user should remain on the login page

### 3. LogoutPage

#### Scenario 1: Logout
- **Given** a user is logged in
- **When** the user clicks on the "Logout" button
- **Then** the user should be logged out
- **And** redirected to the home page
- **And** the login option should be visible

### 4. RegistrationPage

#### Scenario 1: Successful Registration
- **Given** a user navigates to the registration page
- **When** the user enters valid registration details
- **And** clicks the "Register" button
- **Then** the user should be registered successfully
- **And** redirected to the home page
- **And** the user's name should be displayed indicating a successful registration

#### Scenario 2: Invalid Registration
- **Given** a user navigates to the registration page
- **When** the user enters invalid registration details
- **And** clicks the "Register" button
- **Then** an error message should be displayed
- **And** the user should remain on the registration page

### 5. SearchPage

#### Scenario 1: Search for a Product Nike
- **Given** a user is on the home page
- **When** the user enters a valid search query in the search bar
- **And** clicks the "Search" button
- **Then** the search results page should be displayed
- **And** the results should match the search query

#### Scenario 2: Search for a Product Adidas
- **Given** a user is on the home page
- **When** the user enters a valid search query in the search bar
- **And** clicks the "Search" button
- **Then** the search results page should be displayed
- **And** the results should match the search query

#### Scenario 2: Search for a Product CMP
- **Given** a user is on the home page
- **When** the user enters a valid search query in the search bar
- **And** clicks the "Search" button
- **Then** the search results page should be displayed
- **And** the results should match the search query

### 6. Delete Account

#### Scenario 1: Delete Account Information
- **Given** a user is logged in
- **When** the user navigates to the account settings page
- **And** clicks on the "Delete Account" button
- **And** confirms the deletion
- **Then** the user's account information should be permanently deleted
- **And** the user should be redirected to the home page
- **And** the login option should be visible