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

Prerequisites

Java JDK 8 or higher

Maven (optional, for building JAR with pom.xml)
