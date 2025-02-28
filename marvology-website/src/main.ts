import './style.scss'

const heroImgsContainer = document.querySelector<HTMLInputElement>('.heroes-container')
const movieInputBox = document.querySelector<HTMLInputElement>('#moviesInput')
const moviesForm = document.querySelector<HTMLFormElement>('#moviesForm')
const moviesSelected = document.querySelector<HTMLDivElement>('.movies-container--selectedMovies')

if(!heroImgsContainer || !movieInputBox || !moviesForm || !moviesSelected){
    throw new Error('couldnt find it!')
}

type Hero = {
    id : number,
    alias: string,
    image_url: string,
    real_name: string,
    description: string
}

type Movie = {
    id : number,
    title : string,
    release_year : number
}

const handleMovieSearch = async (event : SubmitEvent) => {
    event?.preventDefault();
    moviesSelected.innerHTML = "";
    const response = await fetch("http://localhost:8080/movies/");
    const arrOfMovies = await response.json();
    const inputValue = movieInputBox.value;
        console.log(inputValue);
        console.log("movieSearch");
        console.log(arrOfMovies);
        arrOfMovies.forEach((movie : Movie) => {
            const newInput = inputValue.toLowerCase();
            const newTitle = movie.title.toLowerCase();
            console.log("not in the if")
            console.log(newInput)
            console.log(movie.title)
            if (newTitle.includes(newInput)) {
                const movieText = document.createElement('p');
                movieText.className = 'movie-text';
                moviesSelected.appendChild(movieText);
                movieText.innerText = `${movie.title}`;
                console.log("in if stat")
            }
        } )
}

const handleImgClick = (hero: Hero, heroContainer: HTMLDivElement) => {
    console.log(hero.alias)
    console.log(hero.id)

    const heroText = heroContainer.querySelector(`.hero-text`)
    
    if(!heroText){
        const heroText = document.createElement('div')
        heroText.className = `hero-text`
        heroContainer.appendChild(heroText)

            const heroRealName = document.createElement('p')
            heroRealName.innerText = hero.real_name;
            
            const heroAlias = document.createElement('p')
            heroAlias.innerText = hero.alias;
            
            const heroDesc = document.createElement('p')
            heroDesc.innerText =  hero.description;
            
            heroText.appendChild(heroRealName)
            heroText.appendChild(heroAlias)
            heroText.appendChild(heroDesc)
    } else {
        heroText.remove()
    }

}

const handleImgUpdate = async () => {
    const response = await fetch("http://localhost:8080/heroes/")
    const arrOfHeroes = await response.json();
    console.log(arrOfHeroes)
    arrOfHeroes.forEach((hero:Hero) => {
        const heroContainer = document.createElement('div')
        heroImgsContainer.appendChild(heroContainer)
        heroContainer.className = 'singleHeroContainer'
        const heroImg = document.createElement("img")
        heroContainer.appendChild(heroImg)
        heroImg.src = hero.image_url
        heroImg.addEventListener("click",() => handleImgClick(hero,heroContainer))
    });
}

handleImgUpdate()

moviesForm.addEventListener("submit", handleMovieSearch);