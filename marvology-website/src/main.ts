import './style.scss'

const heroImgsContainer = document.querySelector<HTMLInputElement>('.heroes-container')

if(!heroImgsContainer){
    throw new Error('oculdnt find it!')
}

const handleImgUpdate = async () => {
    const response = await fetch("http://localhost:8080/heroes/")
    const arrOfHeroes = await response.json();
    console.log(arrOfHeroes)
    arrOfHeroes.forEach(element => {
        const heroImg = document.createElement("img")
        heroImgsContainer.appendChild(heroImg)
        heroImg.src = element.image_url
    });
}

handleImgUpdate()