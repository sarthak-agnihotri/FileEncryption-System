# FileEncryptionSystem
Overview

FileEncryptionSystem is a Java console application that allows users to securely manage text files with encryption and decryption.
The system includes user registration, login with password, two-factor authentication (OTP), and file operations such as writing, reading, sharing, and viewing metadata.

It uses XOR-based encryption for simplicity and ensures that file content is only accessible to authenticated users.

## Features

## **User Management**

Register new users with a username and password

Login with username and password

2FA OTP verification after login

## **File Operations**

Write encrypted content to a file

Read and decrypt file content

Check file accessibility

Display file metadata (size, last modified date)

Share file content securely to another file

## **Security**

XOR-based encryption for file contents

Input validation for usernames, passwords, and file names

Two-factor authentication (4-digit OTP)

## Prerequisites

Java JDK 8 or higher

Maven (optional, for building JAR with pom.xml)

Prerequisites

Java JDK 8 or higher

Maven (optional, for building JAR with pom.xml)

## **Getting Started**
**Clone the Repository**
git clone https://github.com/sarthak-agnihotri/FileEncryption-System.git
cd FileEncryption-System

**Build the Project**

If using Maven:

`mvn clean package`


This will generate the JAR file:

`target/FileEncryptionSystem-1.0-SNAPSHOT.jar`


If you don’t use Maven, you can compile manually:

`javac FileEncryptionSystem.java`

Run the Program
Using the JAR file
`java -jar FileEncryptionSystem-1.0-SNAPSHOT.jar`

Using compiled class
`java FileEncryptionSystem`

## Usage

**Register a new user**

Enter a username (max 20 characters)

Enter a password (max 20 characters)

### **Login**

Enter your registered username and password

Complete OTP verification

### **File Operations**

Write content to a file (encrypted)

Read and decrypt file content

Check file accessibility

Display file metadata

Share file securely to another file

Logout or exit program

## Encryption Algorithm

Uses XOR encryption with a user-provided key

Each character of the content is XORed with the corresponding character in the key (repeating if key is shorter than content)

Simple and lightweight for demonstration purposes
