# Scala.JS demo

Install deps and dev tools: 
```sh
npm install
```

Continuous dev (fast rebuild on change):
```sh
../scala package . -w -o main.js -f
npm run dev
```

Production build:
```sh
../scala package . -o main.js -f && npm run build
```
