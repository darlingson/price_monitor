🎯 Project Goal
Build a price tracking REST API that allows users to:

Register/login (JWT-based auth)

Add products to track

Set price drop alerts

View historical price changes

Receive simulated alerts

🧱 Core Modules & Concepts
🧑‍💼 1. Authentication Module
Register / Login (JWT)

Role-based access control (e.g., ROLE_USER, ROLE_ADMIN)

Password encryption (BCrypt)

Security filters + JWT token handling

📦 2. Product Tracking Module
Users can add products to track

Each product includes: name, mockUrl, currentPrice, targetPrice

Products are user-specific

📉 3. Price History Module
Periodically (simulated), update product price

Store each price as a PriceLog

Users can query price history by product

🔔 4. Alert System (Optional)
If price < target, flag an alert

(Optional): Email/send dummy notification

