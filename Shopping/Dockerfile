FROM node:18-alpine
COPY package*.json ./
RUN npm install -g @angular/cli
COPY . .
EXPOSE 4200
CMD ["ng", "serve"]
