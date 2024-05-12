## Introduction

The Application Marketplace is a sales platform developed using Java within Android Studio for the frontend, and Spring Boot for the backend. This comprehensive report highlights various aspects of the application, with a particular focus on the backend features and frontend visual elements.

## Backend

### Entities

#### Article
The central entity of the platform, Article, encapsulates crucial information:
- Name
- Description
- Price
- Category ID

#### Category
Complementing the Article entity, Category consists of:
- ID
- Designation

### Controllers and Endpoints

#### ArticleController

- **Endpoint**: `/getAllArticles`
  - **Description**: Retrieves all available products.
  - **HTTP Method**: GET

- **Endpoint**: `/save`
  - **Description**: Saves a new product.
  - **HTTP Method**: POST
  - **Request Body**: JSON representing the new article.

- **Endpoint**: `/getByCategorie/{id}`
  - **Description**: Retrieves products of a specified category.
  - **HTTP Method**: GET

## Frontend

### Pages

#### Home Page
The home page provides a rich user experience featuring:
- A dropdown menu to select a category.
- A table displaying all products from the selected category, including quantity and average price.
- A button directing to the product creation page.

#### Creation Page
The creation page includes a form to add a new product, with fields corresponding to the attributes of the Article entity.

## Conclusion

The development of the Application Marketplace, leveraging Java, Android Studio, and Spring Boot, has resulted in a robust and user-friendly platform. The seamless integration between the frontend and backend provides an immersive user experience while maintaining efficient server-side data management.

The backend, with Article and Category entities, is specifically designed to meet the needs of online commerce. Key features such as the `/getAllArticles`, `/save`, and `/getByCategorie/{id}` endpoints ensure efficient data manipulation and smooth interaction with the user interface.

The frontend offers intuitive navigation with a home page that immediately displays products by category. The simplified creation form allows users to easily add new products. The detailed screenshots (not included here) testify to the meticulous user interface and the successful implementation of functionalities.

In summary, the Application Marketplace represents a successful fusion of functionality and aesthetics, creating a comprehensive platform that meets the needs of users engaged in online commerce. This project demonstrates the effectiveness of the chosen technology stack and the ability to create powerful, user-friendly applications. It provides a solid foundation for future enhancements and evolutions to maintain the platform's relevance and efficiency in the dynamic e-commerce market.

For more, visit my LinkedIn profile: [Salim Elkellouti](https://www.linkedin.com/in/salim-elkellouti/).
