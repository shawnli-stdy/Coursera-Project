// script.js
const travelData = {
    beaches: [
        { name: "Bora Bora", img1: "images/beach1a.jpg", img2: "images/beach1b.jpg", desc: "Crystal clear waters." },
    ],
    temples: [
        { name: "Angkor Wat", img1: "images/temple1a.jpg", img2: "images/temple1b.jpg", desc: "Historic stone architecture." }
    ],
    countries: [
        { name: "Japan", img1: "images/japan1a.jpg", img2: "images/japan1b.jpg", desc: "A blend of tradition and neon." }
    ]
};

function recommend() {
    const input = document.getElementById('destinationInput').value.toLowerCase();
    const resultsDiv = document.getElementById('results');
    resultsDiv.innerHTML = ''; // Clear previous

    if (input.includes('beach')) {
        displayResults(travelData.beaches);
    } else if (input.includes('temple')) {
        displayResults(travelData.temples);
    } else if (input.includes('japan') || input.includes('country')) {
        displayResults(travelData.countries);
    }
}

function displayResults(data) {
    const resultsDiv = document.getElementById('results');
    data.forEach(item => {
        resultsDiv.innerHTML += `
    <div class="card">
        <h2>${item.name}</h2>
        <div class="image-container">
            <img src="${item.img1}" alt="${item.name} view 1">
            <img src="${item.img2}" alt="${item.name} view 2">
        </div>
        <p>${item.desc}</p>
    </div>
`;
    });
}