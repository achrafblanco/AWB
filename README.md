# 🚀 AWB – Application Web Distribuée

Projet réalisé dans le cadre de la validation de l’UE **Applications Web Distribuées – 4TWIN / 4SAE**  
👩‍🏫 **Encadré par : Oumaima Ibn Fkih**  
📅 **Date : Avril 2025**

---

## 🎯 Objectif

Développer une **application web distribuée** basée sur une architecture **microservices**, intégrant des technologies avancées de **communication**, **sécurité**, **conteneurisation** et **documentation technique**.

---

## 🧱 Stack Technique

- **Spring Boot** – Microservices
- **Eureka** – Service Discovery
- **Spring Cloud Gateway** – Gateway + Sécurité
- **Keycloak** – Authentification & Autorisation (OAuth2 / JWT)
- **Feign Client** – Communication entre microservices
- **Docker & Docker Compose** – Conteneurisation + orchestration
- **MySQL** – Base de données relationnelle
- **Angular** – Frontend (Application utilisateur)
- **Git** – Gestion de version + collaboration
- **Spring Cloud Config Server** – Configuration centralisée

---

## 📦 Microservices développés

| Microservice         | Description                             |
|----------------------|-----------------------------------------|
| `commande-service`   | Gestion des commandes                   |
| `product-service`    | Gestion des produits                    |
| `project-service`    | Gestion des projets                     |
| `gateway-service`    | Point d’entrée sécurisé de l’application |
| `config-server`      | Configuration centralisée               |
| `discovery-service`  | Enregistrement et découverte de services (Eureka) |

---

## 🔐 Sécurité

- Système de sécurité robuste basé sur **Keycloak**
- Mise en œuvre de l’**OAuth2 / JWT** entre la Gateway et les microservices
- Gestion des rôles, authentification et autorisation
- Scénario(s) de sécurité testés et validés

---

## 🔄 Communication entre services

- Utilisation de **Feign Client** pour faciliter les appels REST interservices
- Scénarios de communication démontrant la coopération entre les services (ex. : passage d’une commande impliquant plusieurs services)

---

## 🐳 Dockerisation

- Tous les services sont conteneurisés avec **Docker**
- Un fichier `docker-compose.yml` orchestre l’ensemble des conteneurs (services + Keycloak + bases de données)
- Déploiement local simplifié via un seul point de lancement

---

## 💻 Frontend

- Interface utilisateur moderne développée avec **Angular**
- Connexion sécurisée via **Keycloak**
- Accès aux principales fonctionnalités des services backends via des appels API

---

## 📁 Git & Documentation

- **Historique Git** avec des commits réguliers, clairs et explicites
- Présence d’un **README** complet (vous lisez)

---

## ⚙️ Configuration centralisée

- Utilisation de **Spring Cloud Config Server**
- Tous les microservices récupèrent dynamiquement leur configuration depuis le Config Server

---

## 🌟 Valeur ajoutée (Bonus)

- ✅ Intégration d’un **LocalChatbot** (assistant intégré à l’app)
- ✅ Mise en place d’un système d’**authentification sans mot de passe** (par lien magique / token sécurisé)

---

## 📌 Remarques

- Projet validé dans le cadre d’une évaluation universitaire
- Compatible avec déploiement sur cloud ou local
