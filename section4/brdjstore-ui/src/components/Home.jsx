import products from "../data/products";
import PageHeading from "./PageHeading";
import ProductListings from "./ProductListings";
import BrdjButton from "./BrdjButton";
import developerImage from "../assets/stickers/developer.png";
import breakImage from "../assets/stickers/break.png";
import BootstrapButton from "./BootstrapButton";

export default function Home() {
    const isActive = Math.random() > 0.5;

    const h1Styling = {
    textAlign: "center",
    color: isActive? "black":"red"
    }

    return (
        <>
            {/* <h1 
                className={`my-heading ${
                isActive ? "primary-color" : "secondary-color"
                }`}
            >
                Demo of Global CSS Scope from Home
                </h1>
                <BrdjButton>Home</BrdjButton> */}
            {/* <h1 style={h1Styling}>Demo of Global CSS Scope from Home</h1> */}
            {/* <h1 className="my-heading">Demo of Global CSS Scope from Home</h1> */}
            <div className="home-container">
            <div className="container col-6">
                <BootstrapButton text="Submit" type="primary" />
                <BootstrapButton text="Save" type="secondary" />
                <BootstrapButton text="Okay" type="success" />
                <BootstrapButton text="Cancel" type="danger" />
                <BootstrapButton text="Delete" type="warning" />
                <BootstrapButton text="Link" type="link" />
            </div>
            <div>
                <div class="alert alert-primary" role="alert">
                A simple primary alert-check it out!
                </div>
                <div class="alert alert-secondary" role="alert">
                A simple secondary alert-check it out!
                </div>
                <div class="alert alert-success" role="alert">
                A simple success alert-check it out!
                </div>
                <div class="alert alert-danger" role="alert">
                A simple danger alert-check it out!
                </div>
                <div class="alert alert-warning" role="alert">
                A simple warning alert-check it out!
                </div>
            </div>
            <PageHeading title="Explore Brdj stickers">
            Add a touch of creativity to your space with our wide range of fun and
            unique stickers. Perfect for any occasion!
            </PageHeading>
            <ProductListings products={products}/>
            </div> 
        </>
        
    )
}