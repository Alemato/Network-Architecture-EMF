<!-- PROJECT SHIELDS -->
[![Contributors][contributors-shield]][contributors-url]
[![Commit Activity][commit-shield]][commit-url]
[![Last Commit][last-commit-shield]][last-commit-url]
[![License][license-shield]][license-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/Alemato/Network-Architecture-EMF">
    <img src="docs/logo.webp" alt="Logo" width="650" height="650">
  </a>

<h3 align="center">Network Architecture Modeling with EMF</h3>

  <p align="center">
    University project focused on modeling and simulating network architectures using the Eclipse Modeling Framework (EMF). The model captures key components of a network, such as gateways, routers, switches, VLANs, and WiFi access points, along with their properties and constraints. It includes support for various technologies like NAT, routing protocols, and wireless standards. The project emphasizes the use of formal modeling techniques and OCL constraints to ensure consistency and accuracy in network representations.
    <br />
    <a href="https://github.com/Alemato/Network-Architecture-EMF"><strong>Explore all docs »</strong></a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<p><a name="readme-top"></a></p>
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#network-Architecture-Modeling-with-EMF">Project Overview</a>
    </li>
    <li>
            <a href="#exam-Requirements">Exam Requirements</a>
        <ul>
            <li><a href="#homework-A4---EMF-and-OCL">Homework A4 - EMF and OCL</a></li>
            <li><a href="#homework-A5---Transformations">Homework A5 - Transformations</a></li>
        </ul>
    </li>
<!--
-->
    <li><a href="https://github.com/Alemato/Network-Architecture-EMF/blob/main/LICENSE">License</a></li>
  </ol>
</details>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/Alemato/Network-Architecture-EMF?style=for-the-badge

[contributors-url]: https://github.com/Alemato/Network-Architecture-EMF/graphs/contributors

[commit-shield]: https://img.shields.io/github/commit-activity/t/Alemato/Network-Architecture-EMF?style=for-the-badge

[commit-url]: https://github.com/Alemato/Network-Architecture-EMF/graphs/commit-activity

[last-commit-shield]: https://img.shields.io/github/last-commit/Alemato/Network-Architecture-EMF?style=for-the-badge

[last-commit-url]: https://github.com/Alemato/Network-Architecture-EMF/graphs/commit-activity

[license-shield]: https://img.shields.io/github/license/Alemato/Network-Architecture-EMF?style=for-the-badge

[license-url]: https://github.com/Alemato/Network-Architecture-EMF/blob/master/LICENSE.txt

# Network Architecture Modeling with EMF
The project aims to demonstrate the application of EMF in network modeling and provide a framework for analyzing network design, validating configurations, and generating code or simulations for real-world scenarios.

Developed as part of a university coursework in Model Driven Engineering at University of L'Aquila, this project highlights the use of advanced modeling tools and techniques in the domain of network systems.

# Exam Requirements
Two Homeworks must be completed for the examination (EMF and OCL and Transformations). The requirements for each Homework are listed below

## Homework A4 - EMF and OCL
This homework is about the use of the EMF platforms for modeling the domain defined in the previous works. In particular, it requires the realization of a number of tasks by using the following tools/notations:
* Eclipse modeling Framework and plugins development;
* Ecore metamodel and genmodel;
* OCL in ecore.

Have a look at the code developed during the course https://github.com/MDE-Course-23-24/EMF-OCL-example  

### Task 1  

Define a metamodel in Emfatic or EMF for describing your domain (as illustrated during the course) satisfying the following:
* 9 metaclasses if the group is made of two candidates;  
* 12 metaclasses if the group is made of three candidates;

The metamodel must contain
* inheritance;  
* relations, i.e., containment, non-containment, opposite (optional);
* enumeration types, attributes; 

Each metaclass has at least one attribute or reference; Singleton or isolated metaclasses are not allowed For the evaluation, we will consider:
* Metamodel completeness and coverage;
* Model consistency and homogeneity;  
* Coverage of technological assets (containment and bi-directional references, inheritance, enumeration types, custom data types, etc.).

### Task 2
Create the genmodel file, generate Java APIs, and edit and editor plugin projects.

### Task 3
Create a plugin project to interact with the model APIs:
Please implement the following functionalities:
* Create,
* Serialiaze,
* Load, and
* Validate

models.

### Task 3  
Instantiate the metamodel by two concrete instances and ensure each concept (represented as metaclasses) at the metamodel level can be instantiated in your models.

### Task 4  
Define metamodel constraints (and “critiques” in the case of EVL), operation, and derived fields in OCL or EVL/EOL:

* 3 constraints (critique and constraints) to validate models  
* 2 operations  
* 2 derived fields (only for OCL).

## Homework A5 - Transformations
This homework is about the use of model transformations. It requires the realization of several tasks by using the following languages/frameworks: ATL and Acceleo.

### Task 1
Apply different refactory operations on the metamodel defined in the Homework 1 - EMF and OCL to create an updated version. Those refinements should include:

* Deletion and addition of concepts,
* Concept renaming,
* Structural refinements, for instance:
  * Adding/removing hierarchies,
  * adding/removing structural features (i.e., attributes and references)
  * Change attribute

In our vision, the refining steps should make it easy for you to implement task 3. At this stage, we will evaluate the complexity of the refining steps.

### Task 2
Define an M2M transformation that allows the migration of models conforming to the initial metamodel version to the one refined in task 1. For this task, use ATL.

### Task 3
Define an M2T transformation that generates informative HTML pages for a given domain. By resembling the demo implemented during the lectures, the M2T should generate at least an index page summarizing the model elements linked to informative details pages for the modeled concepts.

For this task, use Acceleo.